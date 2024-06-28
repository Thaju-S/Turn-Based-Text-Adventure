package turnbasedrpg;

import lombok.Data;

@Data
public class PlayerDay1 {

    private String name = "";
    private int health = 100;
    private int hunger = 100;
    private int heat = 100;
    private int money = 0;
    private int oven = 1;
    private int heater = 1;

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
