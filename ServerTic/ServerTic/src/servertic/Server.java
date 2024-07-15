package servertic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import tictactoe.DAL_1;
import tictactoe.UserTable;

public class Server {
    private ServerSocket serverSocket;
    private  boolean running;
    static private Vector<GameSession> gameSessions;

    public static void main(String[] args) {
        new Server().start();
    }

    public Server() {
        gameSessions = new Vector<>();
        try {
            serverSocket = new ServerSocket(5005);
            System.out.println("Server started on port 5005");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void start() {
        if (running) {
            System.out.println("Server is already running.");
            return;
        }
   //   if (serverSocket == null || serverSocket.isClosed()){
        running = true;
        new Thread(() -> {
            try {
                while (running) {
                    Socket clientSocket = serverSocket.accept();
                    DataInputStream input = new DataInputStream(clientSocket.getInputStream());
                    DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

                    // Create a new game session for this client
                    GameSession gameSession = new GameSession(clientSocket, input, output);
                    gameSessions.add(gameSession);
                    gameSession.start();
                }
            } catch (IOException e) {
                if (running) {
                    e.printStackTrace();
                }
            }
        }).start();
     
    }

    public synchronized void stop() {
        if (!running) {
            System.out.println("Server is already stopped.");
            return;
        }

        running = false;
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  private class GameSession extends Thread {
    private Socket clientSocket;
    private DataInputStream input;
    private DataOutputStream output;

    public GameSession(Socket socket, DataInputStream in, DataOutputStream out) {
        this.clientSocket = socket;
        this.input = in;
        this.output = out;
    }

    @Override
    public void run() {
        Thread th=new Thread();
        th.start();
        try {
            while (running) {
                String received = input.readUTF();
                if (received != null) {
                    System.out.println("Received: " + received);
                   // broadcastMove(received);
                   
                    String[] parts = received.split(",");
                    
                    if (parts[0] == "signup"){
                        UserTable user = new UserTable();
                        user.setUserName(parts[1]);
                        user.setPassword(parts[2]);
                        user.setEmail(parts[3]);
                        user.setScore(0);
                        user.setStatus(false);
                        System.out.println(parts[0]);

                        try {
                            DAL_1.insert(user);
                        } catch (SQLException ex) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }    
                        
                        try {
                            this.output.writeUTF(received);
                        } catch (IOException ex) {
                            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                        }
                }
                    
                    
                    
            }
        } catch (IOException e) {
            if (running) {
                e.printStackTrace();
            }
        } finally {
            try {
                input.close();
                output.close();
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

   /* private void broadcastMove(String move) throws IOException {
       // for (GameSession session : gameSessions) {
      // GameSession
           this.output.writeUTF(move);
       // }
       // System.out.println(move);
    }
}*/

  }}












