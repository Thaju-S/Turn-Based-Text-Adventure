package turnbasedrpg;

public class MainGame {

    public static int day = 1;

    public static void main(String[] args)
    {
        PlayerDay1 player = new PlayerDay1();

        System.out.println("\nYou are a border inspection officer for the country of Yembia.");
        System.out.println("Your job is to inspect the documentation of immigrants and confirm that they have no discrepencies.");
        System.out.println("Each shift last 2 real life minutes, and each immigrant you successfully deal with earns you $20.");
        System.out.println("Your ultimate goal is to get through each day by paying rent on time and maintaining your health.");

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