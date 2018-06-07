#Ad lister Project

This is my take on starting a craiglist clone.

## Setup
In order to run this application, you'll need to creat a `config` class inorder for this to work.

```Java```


public class Config {



    private String url = "database";
    private String user = "user_name";
    private String password = "YourSuperSpyPassword";


    public Config(String url, String user, String password) {

        this.url = url;
        this.user = user;
        this.password = password;
    }


    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}

