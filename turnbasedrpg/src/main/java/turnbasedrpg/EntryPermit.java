package turnbasedrpg;

import java.util.Random;

import lombok.Getter;

@Getter
public class EntryPermit {

    private String name;
    private int number;
    private String reason;
    private int[] birthDate;
    private String countryOrigin;
    private String countryDestination;

    public EntryPermit(Passport passport) {
        Random r = new Random();
        if (r.nextInt(15) == 1) {
            this.name = Info.createName();
        }
        else {
            this.name = passport.getName();
        }
        this.number = passport.getNumber() + new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,-1}[r.nextInt(20)];
        this.reason = Info.travel[r.nextInt(Info.travel.length)];
        if (r.nextInt(15) == 1) {
            this.birthDate = Info.createDate();
        }
        else {
            this.birthDate = passport.getBirthDate();
        }
        if (r.nextInt(15) == 1) {
            this.countryOrigin = Info.getCountry();
        }
        else {
            this.countryOrigin = passport.getCountryOrigin();
        }
        if (r.nextInt(15) == 1) {
            this.countryDestination = Info.getCountry();
        }
        else {
            this.countryDestination = "Yembia";
        }
    }
}