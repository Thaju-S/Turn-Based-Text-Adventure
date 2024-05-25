package turnbasedrpg;

import java.time.chrono.ThaiBuddhistEra;

public class MainGame
{
    public static void main( String[] args )
    {
        PlayerDay1 player = new PlayerDay1();

        System.out.println("\nThis is the Border Inspection Game.\n");
        String nInput = UserInput.getString("Enter your name:");
        player.name = (nInput.isBlank() ? "Officer" : nInput);

        System.out.println("Hello, " + player.name + ".");
        System.out.println("You are a border inspection officer.");

        WorkDay.runWorkDay(player);

        player = new PlayerDay2(player);

        WorkDay.runWorkDay(player);


    }
}
