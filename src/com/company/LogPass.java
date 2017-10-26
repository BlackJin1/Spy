package com.company;

/**
 * Класс содержит данные для доступа к сайтам
 * Created by knyazev.v on 26.10.2017.
 */
public class LogPass {
    private String url;
    private String login;
    private String password;

    public LogPass(String url, String login, String password) {
        this.url = url;
        this.login = login;
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
