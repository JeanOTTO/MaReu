package fr.ottobruc.mareu.model;

public class User {
    private static int userCounter = 0;
    private int id;
    private String name;
    private String email;
    private String job;

    public User(String name, String email, String job) {
        id = userCounter;
        this.name = name;
        this.email = email;
        this.job = job;
        userCounter++;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPosition() {
        return job;
    }

}