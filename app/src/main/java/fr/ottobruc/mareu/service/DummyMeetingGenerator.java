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
    public static List<Room> DUMMY_ROOMS = generateRooms();

    public static List<Meeting> DUMMY_MEETINGS = Arrays.asList(
            new Meeting(1, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(0).getName(), "Stratégie d'entreprise", Arrays.asList(DUMMY_USERS.get(10))),
            new Meeting(2, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(1).getName(), "Planification des projets ", Arrays.asList(DUMMY_USERS.get(3))),
            new Meeting(3, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(2).getName(), "Gestion des ressources humaines", Arrays.asList(DUMMY_USERS.get(5))),
            new Meeting(4, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(3).getName(), "Communication interne", Arrays.asList(DUMMY_USERS.get(9))),
            new Meeting(5, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(4).getName(), "MInnovation de produits", Arrays.asList(DUMMY_USERS.get(1))),
            new Meeting(6, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(5).getName(), "Analyse des données et rapports", Arrays.asList(DUMMY_USERS.get(0),DUMMY_USERS.get(8),DUMMY_USERS.get(9))),
            new Meeting(7, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(6).getName(), "Gestion du changement", Arrays.asList(DUMMY_USERS.get(11))),
            new Meeting(8, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(7).getName(), "Gestion des risques", Arrays.asList(DUMMY_USERS.get(13))),
            new Meeting(9, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(8).getName(), "Rétroaction des clients", Arrays.asList(DUMMY_USERS.get(12),DUMMY_USERS.get(2),DUMMY_USERS.get(3))),
            new Meeting(10, new Date(), new Date(), new Date(), DUMMY_ROOMS.get(9).getName(), "Manger le gouter", Arrays.asList(DUMMY_USERS.get(4)))
    );

    protected DummyMeetingGenerator() throws ParseException {
    }

    static List<Meeting> generateMeetings() {
        return new ArrayList<>(DUMMY_MEETINGS);
    }

    private static List<Room> generateRooms() {
        List<Room> rooms = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i, "Salle " + i));
        }
        return rooms;
    }
}
