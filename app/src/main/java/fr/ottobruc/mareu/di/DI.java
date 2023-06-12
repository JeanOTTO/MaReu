package fr.ottobruc.mareu.di;

import fr.ottobruc.mareu.repository.MeetingRepository;
import fr.ottobruc.mareu.service.DummyMeetingApiService;
import fr.ottobruc.mareu.service.MeetingApiService;

public class DI {
    public static MeetingRepository createMeetingRepository() {
        return new MeetingRepository(new DummyMeetingApiService());
    }

    /**
     * Get always a new instance on @{@link MeetingApiService}. Useful for tests, so we ensure the context is clean.
     * @return
     */
    public static MeetingApiService getNewInstanceApiService() {
        return new DummyMeetingApiService();
    }
}