package fr.ottobruc.mareu.service;

import java.util.List;

import fr.ottobruc.mareu.model.Meeting;

public class DummyMeetingApiService implements MeetingApiService{

/**
 * Dummy mock for the Api
 */

    private List<Meeting> meetings = DummyMeetingGenerator.generateMeetings();

    @Override
    public List<Meeting> getMeetings() {
        return meetings;
    }

    @Override
    public void deleteMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

    @Override
    public void createMeeting(Meeting meeting) {
        meetings.add(meeting);
    }
}
