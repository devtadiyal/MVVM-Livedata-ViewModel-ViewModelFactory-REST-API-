package com.snipex.shantu.androidarchitecturecomponentsmvvmretrofitwithjava.model;

public class SendData {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    private String id;
    private String key;
    private String secret;
}
