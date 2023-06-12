package fr.ottobruc.mareu;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.ottobruc.mareu.databinding.MeetingItemBinding;
import fr.ottobruc.mareu.model.Meeting;
import fr.ottobruc.mareu.model.User;

public class MeetingAdapter extends RecyclerView.Adapter<MeetingAdapter.MeetingViewHolder> {
    private List<Meeting> meetings;

    public MeetingAdapter(List<Meeting> meetings) {
        this.meetings = meetings;
    }

    @NonNull
    @Override
    public MeetingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MeetingItemBinding binding = MeetingItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MeetingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MeetingViewHolder holder, int position) {
        Meeting meeting = meetings.get(position);
        holder.bind(meeting);
    }

    @Override
    public int getItemCount() {
        return meetings.size();
    }

    public static class MeetingViewHolder extends RecyclerView.ViewHolder {
        private MeetingItemBinding binding;

        public MeetingViewHolder(@NonNull MeetingItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Meeting meeting) {
            // Mettre à jour les vues avec les données de la réunion
            binding.colorIndicatorView.setColorFilter(meeting.getLocation().getColor());
            binding.subjectTextView.setText(meeting.getSubject()+" - "+"Heure"+" - "+meeting.getLocation().getName());



            // Concaténer les e-mails des participants
            StringBuilder participantsBuilder = new StringBuilder();
            for (User participant : meeting.getParticipants()) {
                participantsBuilder.append(participant.getEmail()).append(", ");
            }
            // Supprimer la virgule et l'espace à la fin
            if (participantsBuilder.length() > 2) {
                participantsBuilder.setLength(participantsBuilder.length() - 2);
            }
            binding.participantsTextView.setText(participantsBuilder.toString());
        }
    }
}
