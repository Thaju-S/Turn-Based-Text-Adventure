package turnbasedrpg;

import java.util.Random;

public class Home {

    public static void printHomeStats(PlayerDay1 player, int energy) {
        System.out.println();
        System.out.println("Health - " + player.getHealth());
        System.out.println("Hunger - " + player.getHunger());
        System.out.println("Heat - " + player.getHeat());
        System.out.println("Energy - " + energy);
    }

    public static void runHome(PlayerDay1 player) {

        System.out.println("You have returned home.");

        Random r = new Random();
        int choice = 0;
        int subChoice = 0;
        int energy = 100;
        int food = 0;
        int moneySpent;

        printHomeStats(player, energy);

        player.setHealth(player.getHealth() - r.nextInt(10,20));
        player.setHeat(player.getHeat() - r.nextInt(10,20));
        player.setHunger(player.getHunger() - r.nextInt(10,20));
        player.setHome(false);

        printHomeStats(player, energy);

        while (energy > 0 && choice != 1) {
            moneySpent = 0;
            System.out.println();
            System.out.println("Options:");
            System.out.println("1 - Sleep");
            System.out.println("2 - Upgrade");
            System.out.println("3 - Pay Bills");
            System.out.println("4 - Cook");
            System.out.println();
            choice = UserInput.getInteger("Enter choice");

            if (choice == 2){
                System.out.println("Options:");
                System.out.println("1 - Oven - " + (player.getOven() >= 3 ? "Already bought" : 100 * player.getOven()));
                System.out.println("2 - Heater - " + (player.getHeater() >= 3 ? "Already bought" : 100 * player.getHeater()));
                System.out.println();
                subChoice = UserInput.getInteger("Enter choice");
            }
            if (choice == 3){
                System.out.println("Options:");
                System.out.println("1 - Rent - $50");
                System.out.println("2 - Heat - $10");
                System.out.println("3 - Groceries - $20");
                System.out.println("4 - Medicine - $5");
                System.out.println();
                subChoice = UserInput.getInteger("Enter choice");

                switch (subChoice) {
                    case 1 -> moneySpent = 50;
                    case 2 -> moneySpent = 10;
                    case 3 -> moneySpent = 20;
                    case 4 -> moneySpent = 50;
                }

                if (player.getMoney() > moneySpent) {
                    player.setMoney(player.getMoney() - moneySpent);
                    System.out.println("You spent $" + moneySpent + ".");
                    switch (subChoice) {
                        case 1 -> player.setHome(true);
                        case 2 -> player.setHeat(player.getHeat() + 15);
                        case 3 -> food += 10;
                        case 4 -> player.setHealth(player.getHealth() + 15);
                    }
                }
                else {
                    System.out.println("You do not have enough money.");
                }

            }
        }
        System.out.println("You went to bed for the day.");
    }

}
