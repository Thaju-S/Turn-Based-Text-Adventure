package turnbasedrpg;

import java.util.Random;

public class PlayerDay1 {

    public String name="";
    private int health=100;
    private int brainP = 100;
    private int money = 0;
    public String animal = "";
    public int bonus = 0;
        
    public void food(){
        
        System.out.println("You look around and find some unfinished food in the Caf");
        System.out.println("No one is looking...   ... Yum Yum");
        health +=20;
        money = money - 1;
    }
 
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int newHealth){
        health = newHealth;
    }
    
    public void learn(){
        if(new Random().nextInt(3)<2){
            System.out.println("You luckily find yourself in a Math class");
            System.out.println("You are enlightened and your brain power increases");
            brainP=brainP + 10;
        }
        else{
            System.out.println("You start watching TIK TOK and waste the day");
            System.out.println("Your brain power diminished");
            brainP=brainP - 5;
        }
    }
    public int getBrainP(){
        return brainP;
    }    
    
    public void setBrainP(int brainP){
        this.brainP=brainP;
    } 
}
