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
    " \\  Soutatei   \\   Yembia   _|\n" +
    " |___     _____/___________/\n" +
    " |   \\___/     |           |\n" +
    "  \\_Uzbekinada |_  Fijand_ |\n" +
    "  / \\____________\\______/ \\|\n" +
    " |       /     |           \\\n" +
    " |Islaru|Gambia| Colicar __|\n" +
    " |______|______|________/   \n";

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

    public static String getName() {
        return names[new Random().nextInt(names.length)] + "" + names[new Random().nextInt(names.length)];
    }
}
