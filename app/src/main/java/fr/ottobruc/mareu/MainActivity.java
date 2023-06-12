package fr.ottobruc.mareu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import fr.ottobruc.mareu.databinding.ActivityMainBinding;
import fr.ottobruc.mareu.di.DI;
import fr.ottobruc.mareu.model.Meeting;
import fr.ottobruc.mareu.repository.MeetingRepository;
import fr.ottobruc.mareu.service.MeetingApiService;

public class MainActivity extends AppCompatActivity implements MeetingAdapter.Listener {
    private ActivityMainBinding binding;
    private MeetingRepository meetingRepository;
    private List<Meeting> meetings;
    private MeetingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        meetingRepository = getMeetingRepository();
        initList();
    }

    public void initList() {
        meetings = meetingRepository.getMeetings();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.meetingRecyclerView.setLayoutManager(layoutManager);
        adapter = new MeetingAdapter(meetings, this);
        binding.meetingRecyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
        binding.meetingRecyclerView.setAdapter(adapter);
    }
/*    public void deleteNeighbour(Meeting meeting) {
        meetingApiService.deleteMeeting(meeting);
        initList();
    }*/
    public void onClickDelete(Meeting meeting) {
        Log.d(MainActivity.class.getName(), "User tries to delete a item.");
        getMeetingRepository().deleteMeeting(meeting);
        initList();
    }

    public MeetingRepository getMeetingRepository() {
        if (meetingRepository == null) meetingRepository = DI.createMeetingRepository();
        return meetingRepository;
    }
}
