package fr.ottobruc.mareu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.List;

import fr.ottobruc.mareu.databinding.ActivityMainBinding;
import fr.ottobruc.mareu.di.DI;
import fr.ottobruc.mareu.model.Meeting;
import fr.ottobruc.mareu.service.MeetingApiService;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MeetingApiService meetingApiService;
    private List<Meeting> meetings;
    private MeetingAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Crée le gestionnaire de disposition
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // Assigne le gestionnaire de disposition à ton RecyclerView
        binding.meetingRecyclerView.setLayoutManager(layoutManager);

        meetingApiService = DI.getMeetingApiService();
        meetings = meetingApiService.getMeetings();

        adapter = new MeetingAdapter(meetings);
        binding.meetingRecyclerView.setAdapter(adapter);
    }
}
