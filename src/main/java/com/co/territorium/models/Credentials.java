package com.co.territorium.models;

public class Credentials {

    private String typedocument;
    private String numberdocument;
    private String password;

    public Credentials(String typedocument, String numberdocument, String password) {
        this.typedocument = typedocument;
        this.numberdocument = numberdocument;
        this.password = password;
    }

    public String getTypedocument() {
        return typedocument;
    }

    public void setTypedocument(String typedocument) {
        this.typedocument = typedocument;
    }

    public String getNumberdocument() {
        return numberdocument;
    }

    public void setNumberdocument(String numberdocument) {
        this.numberdocument = numberdocument;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
