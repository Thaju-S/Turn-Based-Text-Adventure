package turnbasedrpg;

import java.util.Random;

import lombok.Getter;

@Getter
public class Passport {

    private String name;
    private int[] birthDate;
    private int[] expireDate;
    private int number;
    private String countryOrigin;

    public Passport() {
        this.name = Info.createName();
        this.birthDate = Info.createDate();
        this.expireDate = Info.createDate(1983, 1999);
        this.number = new Random().nextInt(10000, 99999);
        this.countryOrigin = Info.getCountry();
    }

}