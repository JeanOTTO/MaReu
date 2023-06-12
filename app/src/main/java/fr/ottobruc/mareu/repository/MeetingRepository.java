package fr.ottobruc.mareu.repository;

import java.util.List;

import fr.ottobruc.mareu.model.Meeting;
import fr.ottobruc.mareu.service.MeetingApiService;

public class MeetingRepository {

    private final MeetingApiService apiService;

    public MeetingRepository(MeetingApiService apiService) {
        this.apiService = apiService;
    }

    public List<Meeting> getMeetings() {
        return apiService.getMeetings();
    }

    public void deleteMeeting(Meeting meeting) {
        apiService.deleteMeeting(meeting);
    }


}
