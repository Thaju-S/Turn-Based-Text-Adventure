package turnbasedrpg;

public class PlayerDay2 extends PlayerDay1{

    public PlayerDay2(){
        super();
        MainGame.day++;
    }

    public PlayerDay2(PlayerDay1 player) {
        this();
        this.setHealth(player.getHealth());
        this.setMoney(player.getMoney());
        this.setHunger(player.getHunger());
        this.setHeat(player.getHeat());
    }

    public String getVisaInfo(Visa visa) {
        return
        "Type: " + visa.getType() +
        "\nName: " + visa.getName();
    }

    public boolean checkIfCorrectChoice(Immigrant immigrant) {
        Passport p = immigrant.getPassport();
        EntryPermit e = immigrant.getEntryPermit();
        Visa v = immigrant.getVisa();
        if (super.checkIfCorrectChoice(immigrant)) {
            if (p.getName() == v.getName()) {
                if (e.getReason() == v.getType()) {
                    return true;
                }
            }
        }
        return false;
    }

}
