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
        int moneySpent;
        player.setHealth(player.getHealth() - 20);
        player.setHeat(player.getHeat() - 20);
        player.setHunger(player.getHunger() - 20);
        player.setHome(false);
        System.out.println("You have gotten hungrier, colder, and more unhealthy.");

        while (energy > 0 && choice != 1) {
            moneySpent = 0;
            System.out.println("Options:");
            System.out.println("1 - Sleep");
            System.out.println("2 - Upgrade");
            System.out.println("3 - Pay Bills");
            System.out.println();
            choice = UserInput.getInteger("Enter choice");

            if (choice == 2){
                System.out.println("Options:");
                System.out.println("1 - ");
                System.out.println("2 - ");
                System.out.println("3 - ");
                System.out.println();
                choice = UserInput.getInteger("Enter choice");
            }
            if (choice == 3){
                System.out.println("Options:");
                System.out.println("1 - Rent - $50");
                System.out.println("2 - Heat - $10");
                System.out.println("3 - Groceries - $20");
                System.out.println("4 - Medicine - $5");
                System.out.println();
                choice = UserInput.getInteger("Enter choice");

                if (choice == 1) {
                    moneySpent = 50;
                }
                if (choice == 2) {
                    moneySpent = 10;
                }
                if (choice == 3) {
                    moneySpent = 20;
                }
                if (choice == 4) {
                    moneySpent = 5;
                }

                player.setMoney(player.getMoney() - moneySpent);
                System.out.println("You spent $" + moneySpent + ".");
            }
        }
        System.out.println("You went to bed for the day.");
    }

}
