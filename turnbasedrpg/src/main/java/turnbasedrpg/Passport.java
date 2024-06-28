package turnbasedrpg;

import java.util.Random;


public class Passport {

    private String name;
    private int[] birthDate;
    private int[] expireDate;
    private int number;
    private String countryOrigin;

    public Passport() {
        this.name = Info.createName();
        this.birthDate = Info.createDate();
        this.expireDate = Info.createDate(1982, 1999);
        if (this.expireDate[2] == 1984) {
            this.expireDate[2]--;
        }
        this.number = new Random().nextInt(10000, 99999);
        this.countryOrigin = Info.getCountry();
    }

    public String getName() {
        return name;
    }

    public int[] getBirthDate() {
        return birthDate;
    }

    public int[] getExpireDate() {
        return expireDate;
    }

    public int getNumber() {
        return number;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

}