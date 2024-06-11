package turnbasedrpg;

import java.util.Random;

public final class Info {

    private static Random r = new Random();

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
    " \\  New Guino  \\   Yembia   /\n" +
    " |___     _____/___________/\n" +
    " |   \\___/     |           |\n" +
    "  \\_  Bolipia  |_  Fijand_ |\n" +
    "  / \\____________\\______/ \\|\n" +
    " | West | East |           \\\n" +
    " |Mollia|Mollia|  Quebec __|\n" +
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

    public static final String[] months = {
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    };

    public static String createName() {
        if (r.nextInt(3) == 0) {
            return names[r.nextInt(names.length)] + " " + names[r.nextInt(names.length)] + " " + names[r.nextInt(names.length)];
        }
        return names[r.nextInt(names.length)] + " " + names[r.nextInt(names.length)];
    }

    public static int[] getDate() {
        return new int[] {r.nextInt(1,32), r.nextInt(1,13), r.nextInt(1900,1960)};
    }

    public static int[] getDate(int startYear, int endYear) {
        return new int[] {r.nextInt(1,32), r.nextInt(1,13), r.nextInt(1900,1960)};
    }

    public static int[] getTodayDate(PlayerDay1 player) {
        return new int[] {11 + player.getDay(), 11, 1984};
    }

    public static String getDateString(int[] date) {
        return months[date[1] - 1] + " " + date[0] + ", " + date[2];
    }
}