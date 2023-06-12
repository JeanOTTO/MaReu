package fr.ottobruc.mareu.model;

public class Room {
    private int id;
    private String name;
    private int color;

    public Room(int id, String name, int color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getColor() {
        return color;
    }

}
