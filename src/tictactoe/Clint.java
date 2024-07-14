
package tictactoe;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clint implements Runnable
{
    private Thread thread;
    private Socket clientSocket;
    private DataInputStream dis;
    private DataOutputStream dos;
    Clint()
    {
      try {
            
            clientSocket = new Socket("10.178.240.32", 5005);
            dis = new DataInputStream(clientSocket.getInputStream());
            dos = new DataOutputStream(clientSocket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
        }

        thread = new Thread(this);
        thread.start();
    }


     @Override
    public void run() {
        try {
            while (!clientSocket.isClosed()) {
                String input = dis.readUTF();
                //chatBox.appendText("\n" + input);
            }
        } catch (IOException ex) {
            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
//                if (!clientSocket.isClosed()) {
//                    clientSocket.close();
//                }
                if (dis != null) {
                    dis.close();
                }
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
//    protected void sendMovement(javafx.event.ActionEvent actionEvent) {
//        try {
//            dos.writeUTF(sendBox.getText());
//            sendBox.setText("");
//        } catch (IOException ex) {
//            Logger.getLogger(Clint.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    
}
