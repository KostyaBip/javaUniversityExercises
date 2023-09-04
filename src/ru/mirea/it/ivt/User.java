package ru.mirea.it.ivt;

public class User {
    static int NumberOfUsers = 0;
    private String username;
    private String password;

    public User(){
        NumberOfUsers++;
        this.username = "admin";
        this.password = "0000";
    }

    public User(String username, String password) {
        NumberOfUsers++;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + this.getUsername() + "; Password: " + this.getPassword();
    }
}
