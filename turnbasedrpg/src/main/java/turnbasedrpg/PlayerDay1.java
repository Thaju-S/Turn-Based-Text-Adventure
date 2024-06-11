package turnbasedrpg;

import lombok.Data;

@Data
public class PlayerDay1 {

    private String name = "";
    private int health = 100;
    private int hunger = 100;
    private int heat = 100;
    private int money = 1000;
    private int oven = 1;
    private int heater = 1;
    private int day = 1;

    public String getPassportInfo(Passport passport) {
        return
        "Name: " + passport.getName() +
        "\nDate: " + passport.getDateString() +
        "\nNumber: " + passport.getNumber();
    }

    public String getMap() {
        return Info.map;
    }

    public void checkIfCorrectChoice(boolean choice, Immigrant immigrant) {
    }

}
