package com.example.katraidmaa.foodzie;


public class User {

    String name, username, password;

    public User (String name, String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;

    }
 // teine viis kuidas saab kirjutada, ilma nimeta.
    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.name= "...";
    }
}
