package turnbasedrpg;

import java.util.Random;

public class Immigrant {

    private static String[] names = {
    "Taylor",   "Morgan",   "Jordan",   "Parker",   "Cameron", 
    "Reed",     "Hayden",   "Blake",    "Logan",    "Hunter",
    "Quinn",    "Drew",     "Bailey",   "Riley",    "Casey",
    "Avery",    "Sydney",   "Marley",   "Brady",    "Ellis",
    "Spencer",  "Sawyer",   "Harper",   "Mason",    "Brooks",
    "Alex",     "Tyler",    "Dylan",    "Chandler", "Cooper",
    "Emerson",  "Finley",   "Harrison", "Jesse",    "Kennedy", 
    "Lane",     "Marsh",    "Nolan",    "Payton",   "Reagan",
    "Shane",    "Tanner",   "Wade",     "Walker",   "Wyatt",
    "Austin",   "Bennett",  "Brent",    "Collins",  "Elliot",
    "Grant",    "Grayson",  "Holland",  "Kendall",  "Lennon"
    };

    private String name = createName();

    public static String createName() {
        Random rand = new Random();
        return names[rand.nextInt(names.length)] + " " + names[rand.nextInt(names.length)];
    }
}
