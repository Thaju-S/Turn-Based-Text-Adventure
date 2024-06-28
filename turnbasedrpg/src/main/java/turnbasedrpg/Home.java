package turnbasedrpg;

import java.util.Random;

public class Home {

    public static void printHomeStats(PlayerDay1 player, int energy) {

        System.out.println();
        System.out.println("Health - " + player.getHealth());
        System.out.println("Hunger - " + player.getHunger());
        System.out.println("Heat - " + player.getHeat());
        System.out.println("Energy - " + energy);
        System.out.println("Money - $" + player.getMoney());
    }

    public static void runHome(PlayerDay1 player) {

        System.out.println("\nYou have returned home.");

        Random r = new Random();
        int choice = 0;
        int subChoice = 0;
        int energy = 100;
        int moneySpent;
        boolean paidRent = false;

        player.setHealth(player.getHealth() - r.nextInt(10,30));
        player.setHeat(player.getHeat() - r.nextInt(10,30));
        player.setHunger(player.getHunger() - r.nextInt(10,30));

        if (player.getHealth() <= 0 || player.getHeat() <= 0 || player.getHunger() <= 0) {
            System.out.println("You didn't make it'.\nGame Over!");
            System.exit(0);
        }

        while (energy > 0 && choice != 1) {

            printHomeStats(player, energy);

            moneySpent = 0;

            System.out.println();
            System.out.println("Options:");
            System.out.println("1 - Sleep");
            System.out.println("2 - Upgrade");
            System.out.println("3 - Pay Bills");
            System.out.println();
            choice = UserInput.getInteger("Enter choice");

            if (choice == 2){
                System.out.println("Options:");
                System.out.println("1 - Oven - $" + 50 * (player.getOven() + 1));
                System.out.println("2 - Heater - $" + 50 * (player.getHeater() + 1));
                System.out.println();
                subChoice = UserInput.getInteger("Enter choice");

                if (subChoice == 1) {
                    moneySpent = 50 * (player.getOven() + 1);
                    if (player.getMoney() >= moneySpent) {
                        System.out.println("You spent $" + moneySpent);
                        player.setOven(player.getOven() + 1);
                        System.out.println("Your oven is now level " + player.getOven());
                    }
                    else {
                        System.out.println("You cannot buy that.");
                    }
                }

                if (subChoice == 2) {
                    moneySpent = 50 * (player.getHeater() + 1);
                    if (player.getMoney() >= moneySpent) {
                        System.out.println("You spent $" + moneySpent);
                        player.setHeater(player.getHeater() + 1);
                        System.out.println("Your heater is now level " + player.getHeater());
                    }
                    else {
                        System.out.println("You cannot buy that.");
                    }
                }
            }
            if (choice == 3){
                System.out.println("Options:");
                System.out.println("1 - Rent - " + (paidRent ? "Already bought": "$" + 10 * (MainGame.day + 4)));
                System.out.println("2 - Heat - $10");
                System.out.println("3 - Groceries - $20");
                System.out.println("4 - Medicine - $5");
                System.out.println();
                subChoice = UserInput.getInteger("Enter choice");

                switch (subChoice) {
                    case 1 -> moneySpent = 10 * (MainGame.day + 4);
                    case 2 -> moneySpent = 10;
                    case 3 -> moneySpent = 20;
                    case 4 -> moneySpent = 5;
                }

                if (player.getMoney() >= moneySpent) {
                    player.setMoney(player.getMoney() - moneySpent);
                    if (!paidRent || subChoice != 1) {
                    System.out.println("You spent $" + moneySpent + ".");}
                    switch (subChoice) {
                        case 1: {
                            if (!paidRent) {
                                paidRent = true;
                                System.out.println("You have successfully paid off rent (for now)");
                                energy -= r.nextInt(5,15);
                            }
                            else {
                                System.out.println("You already paid rent.");
                            }
                            break;
                        }
                        case 2: {
                            player.setHeat(player.getHeat() + 5 + (10 * player.getHeater()));
                            System.out.println("Your heat is now " + player.getHeat());
                            energy -= r.nextInt(5,15);
                            break;
                        }
                        case 3: {
                            player.setHunger(player.getHunger() + 5 + (10 * player.getOven()));
                            System.out.println("Your hunger is now " + player.getHunger());
                            energy -= r.nextInt(5,15);
                            break;
                        }
                        case 4: {
                            player.setHealth(player.getHealth() + 15);
                            System.out.println("Your health is now " + player.getHealth());
                            energy -= r.nextInt(5,15);
                            break;
                        }
                    }
                }
                else {
                    System.out.println("You do not have enough money.");
                }

            }
        }
        if (paidRent) {
            System.out.println("You went to bed for the day.");
        }
        else{
            System.out.println("You did not pay rent today, so you got kicked out.\nGame Over!");
            System.exit(0);
        }
    }

}
