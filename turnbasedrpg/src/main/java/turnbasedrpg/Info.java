package turnbasedrpg;

import java.util.Random;

public class Info {

    private Info() {}

    public static final String map =
    "            ______\n" +
    "           /      \\_\n" +
    "         _/ Morrand \\\n" +
    "    ____/____________\\___\n" +
    "   /           |         \\\n" +
    "  / Austoritrin \\ Poldorea \\\n" +
    " /____________  _|___________\\\n" +
    "|             \\/             /\n" +
    " \\  New Guino  \\   Yembia   _|\n" +
    " |___     _____/___________/\n" +
    " |   \\___/     |           |\n" +
    "  \\_  Bolippia |_  Fijand_ |\n" +
    "  / \\____________\\______/ \\|\n" +
    " | West | East |           \\\n" +
    " |Mollia|Mollia| Colicar __|\n" +
    "  \\_____|___   |________/   \n" +
    "            \\_/";

    public static final String[] names = {
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

    public static String createName() {
        if (new Random().nextInt(3) == 0) {
            return names[new Random().nextInt(names.length)] + " " + names[new Random().nextInt(names.length)] + " " + names[new Random().nextInt(names.length)];
        }
        return names[new Random().nextInt(names.length)] + " " + names[new Random().nextInt(names.length)];
    }
}