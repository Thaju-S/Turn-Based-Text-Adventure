package turnbasedrpg;

public class Work {

    public static void runWork(PlayerDay1 player) {

        System.out.println("\n" + Info.getDateString(Info.getTodayDate(MainGame.day)) + ".");

        if (MainGame.day == 2) {System.out.println("\nImmigrants now carry visas.");}

        System.out.println("\nYou have begun your work shift.");

        int choice = 1;
        Timer t = new Timer(120);
        t.start();
        Immigrant immigrant = new Immigrant();

        while(choice != 0) {

            System.out.println("\nOptions:");
            System.out.println("1 - Accept");
            System.out.println("2 - Reject");
            System.out.println("3 - See Map");
            System.out.println("4 - See Passport");
            System.out.println("5 - See Entry Permit");
            if (MainGame.day >= 2) {System.out.println("6 - See Visa");}
            System.out.println();
            choice = UserInput.getInteger("Enter choice");

            if (choice == 1 || choice == 2) {
                if ((choice == 1) == player.checkIfCorrectChoice(immigrant)) {
                    System.out.println("Correct! You have been awarded $20.");
                    player.setMoney(player.getMoney() + 20);
                }
                else {
                    System.out.println("Wrong! $20 have been deducted.");
                    player.setMoney(player.getMoney() - 20);
                }
                if (t.getState() == Thread.State.TERMINATED) {
                    break;
                }
                immigrant = new Immigrant();
            }
            if (choice == 3) {
                System.out.println(player.getMap());
            }

            if (choice == 4) {
                System.out.println(player.getPassportInfo(immigrant.getPassport()));
            }

            if (choice == 5) {
                System.out.println(player.getEntryPermitInfo(immigrant.getEntryPermit()));
            }

            if (choice == 6) {
                System.out.println(player.getVisaInfo(immigrant.getVisa()));
            }

        }
        System.out.println("Your shift has ended.");
    }
}
