
package tictactoe;

public class UserTable {
    String userName;
    String Password;
    String email;
    String score;
    boolean status;

    public UserTable(String userName, String Password, String email, String score, boolean status) {
        this.userName = userName;
        this.Password = Password;
        this.email = email;
        this.score = score;
        this.status = status;
    }

   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
