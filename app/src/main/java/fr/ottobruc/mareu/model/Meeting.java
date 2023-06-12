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
    private Room location;
    private String subject;
    private List<User> participants;



    public Meeting(int id, Date startTime, Date endTime, Date date, Room location, String subject, List<User> participants) {
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
    public Room getLocation() {
        return location;
    }
    public String getSubject() {
        return subject;
    }
    public Date getStartTime() {
        return startTime;
    }
    public List<User> getParticipants() {
        return participants;
    }


}
