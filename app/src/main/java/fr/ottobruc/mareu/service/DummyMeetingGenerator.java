package fr.ottobruc.mareu.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import fr.ottobruc.mareu.model.Meeting;
import fr.ottobruc.mareu.model.Room;
import fr.ottobruc.mareu.model.User;

public abstract class DummyMeetingGenerator {

    public static List<User> DUMMY_USERS = Arrays.asList(
            new User("Néo", "neo@lamzone.com", "Programmeur"),
            new User("Luke Skywalker", "luke@lamzone.com", "Jedi"),
            new User("Hermione Granger", "hermione@lamzone.com", "Sorcière"),
            new User("James Bond", "jamesbond@lamzone.com", "Agent secret"),
            new User("Indiana Jones", "indianajones@lamzone.com", "Archéologue"),
            new User("Bob l'éponge", "bob@lamzone.com", "Eponge"),
            new User("Tony Stark", "tonystark@lamzone.com", "Iron Man"),
            new User("Ellen Ripley", "ripley@lamzone.com", "Astronaute"),
            new User("Marty McFly", "marty@lamzone.com", "Voyageur dans le temps"),
            new User("Leia Organa", "leia@lamzone.com", "Princesse"),
            new User("Harry Potter", "harry@lamzone.com", "Sorcier"),
            new User("Trinity", "trinity@lamzone.com", "Hackeuse"),
            new User("Capitaine Jack Sparrow", "jack@lamzone.com", "Pirate"),
            new User("Sarah Connor", "sarahconnor@lamzone.com", "Combattante de la Résistance"),
            new User("Frodon Sacquet", "frodo_bogoss@lamzone.com", "Hobbit")
    );
    public static List<Room> DUMMY_ROOMS = Arrays.asList(
            new Room(1, "Mario", 0xFFBB86FC),         // Coral
            new Room(2, "Luigi", 0xFF98FB98),         // PaleGreen
            new Room(3, "Link", 0xFFADD8E6),          // LightBlue
            new Room(4, "Zelda", 0xFFFFD700),         // Gold
            new Room(5, "Pikachu", 0xFFFFDAB9),       // PeachPuff
            new Room(6, "Donkey Kong", 0xFFFF69B4),   // HotPink
            new Room(7, "Samus", 0xFF87CEFA),         // LightSkyBlue
            new Room(8, "Yoshi", 0xFF9ACD32),         // YellowGreen
            new Room(9, "Kirby", 0xFFFFC0CB),         // Pink
            new Room(10, "Fox McCloud", 0xFF7FFFD4)    // Aquamarine
    );

    public static List<Meeting> DUMMY_MEETINGS = Arrays.asList(
            new Meeting(1, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(0), "Réunion A", Arrays.asList(DUMMY_USERS.get(10))),
            new Meeting(2, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(1), "Réunion B", Arrays.asList(DUMMY_USERS.get(3))),
            new Meeting(3, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(2), "Réunion C", Arrays.asList(DUMMY_USERS.get(5))),
            new Meeting(4, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(3), "Réunion D", Arrays.asList(DUMMY_USERS.get(9))),
            new Meeting(5, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(4), "Réunion E", Arrays.asList(DUMMY_USERS.get(1))),
            new Meeting(6, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(5), "Réunion F", Arrays.asList(DUMMY_USERS.get(0),DUMMY_USERS.get(8),DUMMY_USERS.get(9))),
            new Meeting(7, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(6), "Réunion G", Arrays.asList(DUMMY_USERS.get(11))),
            new Meeting(8, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(7), "Réunion H", Arrays.asList(DUMMY_USERS.get(13))),
            new Meeting(9, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(8), "Réunion I", Arrays.asList(DUMMY_USERS.get(12),DUMMY_USERS.get(2),DUMMY_USERS.get(3))),
            new Meeting(10, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(9), "Réunion J", Arrays.asList(DUMMY_USERS.get(4)))
    );

    protected DummyMeetingGenerator() throws ParseException {
    }

    static List<Meeting> generateMeetings() {
        return new ArrayList<>(DUMMY_MEETINGS);
    }

}
