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
        this.setDay(2);
    }

}
