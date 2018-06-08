package com.codeup.adlister;

public class Config {
    private String url;
    private String user;
    private String password;

    public Config(String url, String user, String password) {
        this.url = "jdbc:mysql://localhost:URL";
        this.user = "user";
        this.password = "password";
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {

        return url;
    }

    public String getUser() {
        return user;
    }



    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}