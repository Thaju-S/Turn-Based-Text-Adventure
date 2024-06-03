package turnbasedrpg;

public class Day {

    public static void runWorkDay(PlayerDay1 player) {
        int choice = 1;
        Timer t = new Timer(300);
        t.start();
        while(t.getState() != Thread.State.TERMINATED && choice != 0){

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

            player.setHealth((player.getHealth() - 10));

            System.out.println("Health = "+player.getHealth());

            if(player.getHealth()<=0){
                System.out.println("You didn't make it");
                choice=0;
            }
        }
        System.out.println("\nThe day has ended.\n");
        if (player.getDay() != 5) {
            runHomeDay(player);
        }
    }

    public static void runHomeDay(PlayerDay1 player) {
        int choice = 0;
        int energy = 100;
        while (energy > 0 && choice != 1) {
            System.out.println("Options:");
            System.out.println("1 - Sleep");
            System.out.println("2 - Upgrade");
            System.out.println("3 - Pay Bills");
            System.out.println();
            choice = UserInput.getInteger("Enter choice");

            if (choice == 1){
                System.out.println("learn");
            }
            if (choice == 2){
                System.out.println("food");
            }
        }
        System.out.println("You went to bed for the day.");
    }

}
