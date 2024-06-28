package turnbasedrpg;

public class PlayerDay1 {

    private String name = "";
    private int health = 100;
    private int hunger = 100;
    private int heat = 100;
    private int money = 0;
    private int oven = 1;
    private int heater = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getOven() {
        return oven;
    }

    public void setOven(int oven) {
        this.oven = oven;
    }

    public int getHeater() {
        return heater;
    }

    public void setHeater(int heater) {
        this.heater = heater;
    }

    public String getPassportInfo(Passport passport) {
        return
        "Name: " + passport.getName() +
        "\nDate of Birth: " + Info.getDateString(passport.getBirthDate()) +
        "\nPassport Number: " + passport.getNumber() +
        "\nCountry of Origin: " + passport.getCountryOrigin() +
        "\nExpiration Date: " + Info.getDateString(passport.getExpireDate());
    }

    public String getEntryPermitInfo(EntryPermit entryPermit) {
        return
        "Name: " + entryPermit.getName() +
        "\nReason For Entry: " + entryPermit.getReason() +
        "\nCountry of Origin: " + entryPermit.getCountryOrigin() +
        "\nDestination: " + entryPermit.getCountryDestination() +
        "\nPassport Number: " + entryPermit.getNumber() +
        "\nDate of Birth: " + Info.getDateString(entryPermit.getBirthDate());

    }

    public String getVisaInfo(Visa visa) {
        return "";
    }

    public String getMap() {
        return Info.map;
    }

    public boolean checkIfCorrectChoice(Immigrant immigrant) {
        Passport p = immigrant.getPassport();
        EntryPermit e = immigrant.getEntryPermit();
        if (p.getName().equals(e.getName())) {
            if (p.getNumber() == e.getNumber()) {
                if (p.getBirthDate() == e.getBirthDate()) {
                    if (p.getExpireDate()[2] > 1984) {
                        if (p.getCountryOrigin().equals(e.getCountryOrigin())) {
                            if (e.getCountryDestination().equals("Yembia")) {
                                return true;
                            }
                        }
                    }
                }

            }
        }
        return false;
    }

}
