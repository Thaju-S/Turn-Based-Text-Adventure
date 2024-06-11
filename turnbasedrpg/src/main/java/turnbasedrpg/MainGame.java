package turnbasedrpg;

import java.time.chrono.ThaiBuddhistEra;

public class MainGame
{
    public static void main(String[] args)
    {
        PlayerDay1 player = new PlayerDay1();

        System.out.println("\nThis is the Border Inspection Game.\n");
        String nInput = UserInput.getString("Enter your name:");
        player.setName(nInput.isBlank() ? "Officer" : nInput);

        System.out.println("Hello, " + player.getName() + ".\n");
        System.out.println("You are a border inspection officer for the country of Yembia.");
        System.out.println("Your job is to inspect the identification of immigrants and confirm that they are valid.");
        System.out.println("Each shift last 3 real life minutes, and each immigrant you successfully deal with earns you $20.");
        System.out.println("Your ultimate goal is to get through 5 days by paying rent on time and maintaining your health.");

        System.out.println("\nPress enter to begin playing!");
        UserInput.getString("Press enter to begin playing!");

        Work.runWork(player);

        Home.runHome(player);

        player = new PlayerDay2(player);

        Work.runWork(player);

        Home.runHome(player);

        System.out.println("You did it!");

    }
}