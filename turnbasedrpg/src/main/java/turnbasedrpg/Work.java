package turnbasedrpg;

import java.util.Random;

public class Work {

    public static void runWork(PlayerDay1 player) {

        System.out.println("\n" + Info.getDateString(Info.getTodayDate(player)) + ".");
        System.out.println("You have begun your work shift.");

        Random r = new Random();
        int choice = 1;
        Timer t = new Timer(180 + r.nextInt(0,1));
        t.start();
        Immigrant immigrant = new Immigrant();

        while(t.getState() != Thread.State.TERMINATED && choice != 0) {

            System.out.println("\nOptions:");
            System.out.println("1 - Accept");
            System.out.println("2 - Reject");
            System.out.println("3 - See Passport");
            System.out.println("4 - See Map");
            System.out.println();
            choice = UserInput.getInteger("Enter choice");

            if (choice == 1 || choice == 2) {
                player.checkIfCorrectChoice(choice == 1, immigrant);
                immigrant = new Immigrant();
            }

            if (choice == 3) {
                System.out.println(player.getPassportInfo(immigrant.getPassport()));
            }

            if (choice == 4) {
                System.out.println(player.getMap());
            }

        }
        System.out.println("Your shift has ended.");
    }
}
