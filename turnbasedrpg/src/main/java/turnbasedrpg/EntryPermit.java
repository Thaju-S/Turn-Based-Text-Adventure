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
        this.name = (r.nextInt(15) == 1 ? Info.createName() : passport.getName());
        this.number = passport.getNumber() + new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,-1}[r.nextInt(20)];
        this.reason = Info.travel[r.nextInt(Info.travel.length)];
        this.birthDate = (r.nextInt(15) == 1 ? Info.createDate() : passport.getBirthDate());
        this.countryOrigin = (r.nextInt(15) == 1 ? Info.getCountry() : passport.getCountryOrigin());
        this.countryDestination = (r.nextInt(15) == 1 ? Info.getCountry() : "Yembia");
    }
}