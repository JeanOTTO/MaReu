package fr.ottobruc.mareu.service;

import java.util.List;

import fr.ottobruc.mareu.model.Meeting;

public interface MeetingApiService {

    /**
     * Get all my Neighbours
     * @return {@link List}
     */
    List<Meeting> getMeetings();

    /**
     * Deletes a neighbour
     * @param meeting
     */
    void deleteMeeting(Meeting meeting);

    /**
     * Create a neighbour
     * @param meeting
     */
    void createMeeting(Meeting meeting);
}
