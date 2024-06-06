package turnbasedrpg;

import java.util.Random;

public class Work {

    public static void runWork(PlayerDay1 player) {

        System.out.println("You have begun your work shift.");

        Random r = new Random();
        int choice = 1;
        Timer t = new Timer(300);
        t.start();
        while(t.getState() != Thread.State.TERMINATED && choice != 0){

            System.out.println();
            System.out.println("Options:");
            System.out.println("1 - learn");
            System.out.println("2 - eat and sleep");
            System.out.println();
            choice = UserInput.getInteger("Enter choice");

            if (choice == 1){
                player.learn();
            }

            if (choice == 2){
                player.food();
            }

        }
        System.out.println("Your shift has ended.");
    }
}
