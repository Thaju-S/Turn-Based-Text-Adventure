package turnbasedrpg;

import java.util.Random;

import lombok.Data;

@Data
public class PlayerDay1 {

    private String name = "";
    private int health = 100;
    private int hunger = 100;
    private int heat = 100;
    private int money = 0;
    private boolean home = true;
    private int oven = 1;
    private int heater = 1;

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

}
