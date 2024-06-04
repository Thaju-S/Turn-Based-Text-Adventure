package turnbasedrpg;

import java.util.Random;

public class PlayerDay2 extends PlayerDay1{

    public PlayerDay2(){
        super();
    }

    public PlayerDay2(PlayerDay1 player) {
        this();
        this.setHealth(player.getHealth());
        this.setMoney(player.getMoney());
        this.setHunger(player.getHunger());
        this.setHeat(player.getHeat());
        this.setHome(player.getHome());
    }

    @Override
    public int getDay() {
        return 2;
    }

    @Override
    public void learn(){
      int chance = new Random().nextInt(3);
      System.out.println("The chances are: " + chance);
        if(chance<2){
            System.out.println("You found a tutor");
            System.out.println("The extra studying ");
            super.setMoney(getMoney()+20);
        }
        else{
            System.out.println("You started hip hop dancing to polka");
            System.out.println("You lost brain power");
            super.setMoney(getMoney()-5);
        }
    }

}
