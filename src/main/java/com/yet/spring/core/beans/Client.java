package com.yet.spring.core.beans;

/**
 * Created by Sanya on 18.08.2018.
 */
public class Client {
    private String id;
    private String fullName;
    private String greeting;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;

    }
}
