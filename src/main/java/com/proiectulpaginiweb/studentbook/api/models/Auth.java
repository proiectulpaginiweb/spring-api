package com.proiectulpaginiweb.studentbook.api.models;

public class Auth {

    private final String token;

    public Auth(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }

}
