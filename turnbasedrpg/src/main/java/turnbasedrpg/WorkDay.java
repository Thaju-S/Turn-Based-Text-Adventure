package turnbasedrpg;

public class WorkDay {

    public static void runWorkDay(PlayerDay1 player) {

        int choice = 1;
        Timer t = new Timer();
        t.start();
        while(t.getState() != Thread.State.TERMINATED && choice != 0){
            System.out.println("Options:");
            System.out.println("1 - learn");
            System.out.println("2 - eat and sleep");
            System.out.println();
            choice = UserInput.getInteger("Enter choice");

            if(choice == 2){
                player.food();
            }
            if(choice == 1){
                player.learn();
            }
            player.setHealth((player.getHealth() - 10));

            System.out.println("Health = "+player.getHealth());
            System.out.println("Brain Power = "+player.getBrainP() );

            if(player.getHealth()<=0){
                System.out.println("You didn't make it");
                choice=0;
            }
        }
        System.out.println("\nThe day has ended.\n");

    }

}
