package turnbasedrpg;

import java.util.Random;

public class PlayerDay1 {

    public String name = "";
    private int health = 100;
    private int hunger = 100;
    private int heat = 100;
    private int money = 0;

    public int getDay() {
        return 1;
    }
    public void food(){

        System.out.println("You look around and find some unfinished food in the Caf");
        System.out.println("No one is looking...   ... Yum Yum");
        health += 20;
        money -= 1;
    }

    public void learn(){
        if(new Random().nextInt(3)<2){
            System.out.println("You luckily find yourself in a Math class");
            System.out.println("You are enlightened and your brain power increases");
            money += 10;
        }
        else{
            System.out.println("You start watching TIK TOK and waste the day");
            System.out.println("Your brain power diminished");
            money -= 5;
        }
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int newHealth){
        health = newHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }

}
