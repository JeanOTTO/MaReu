package fr.ottobruc.mareu.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Meeting {
    private int id;
    private Date startTime;
    private Date endTime;
    private Date date;
    private String location;
    private String subject;
    private List<User> participants;



    public Meeting(int id, Date startTime, Date endTime, Date date, String location, String subject, List<User> participants) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.location = location;
        this.subject = subject;
        this.participants = participants;
    }

    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public String getLocation() {
        return location;
    }
    public String getSubject() {
        return subject;
    }
    public List<User> getParticipants() {
        return participants;
    }

}
