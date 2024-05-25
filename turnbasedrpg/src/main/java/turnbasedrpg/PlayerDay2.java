package turnbasedrpg;

import java.util.Random;

public class PlayerDay2 extends PlayerDay1{

    public PlayerDay2(){
        super();
        this.bonus=10;
    }

    public PlayerDay2(PlayerDay1 player) {
        this();
        this.setHealth(player.getHealth());
        this.setBrainP(player.getBrainP());
    }

    @Override
    public void learn(){
      int chance = new Random().nextInt(3);
      System.out.println("The chances are: " + chance);
        if(chance<2){
            System.out.println("You found a tutor");
            System.out.println("The extra studying ");
            super.setBrainP(super.getBrainP()+20);
        }
        else{
            System.out.println("You started hip hop dancing to polka");
            System.out.println("You lost brain power");
            super.setBrainP(super.getBrainP()-5);
        }
    }

    @Override
    public int getDay() {
        return 2;
    }
}
