package turnbasedrpg;

import java.util.Random;

public class PlayerLevel2 extends PlayerLevel1{
    
    public PlayerLevel2(){
        super();
        this.bonus=10;
        this.animal = "Lynx";
        System.out.println("After 5 turns you are upgraded to a scout"); 
    }

    public PlayerLevel2(PlayerLevel1 player) {
        this();
        this.setHealth(player.getHealth());
        this.setBrainP(player.getBrainP());
        System.out.println("You have developed enhance learning skills after 8 turns");
        System.out.println("Upgraded to Geek");
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
}
