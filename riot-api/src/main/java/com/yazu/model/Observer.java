package com.yazu.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Observer {
    @JsonProperty("encryptionKey")
    private String encryptionKey;

    public Observer() {
    }

    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public Observer(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

}