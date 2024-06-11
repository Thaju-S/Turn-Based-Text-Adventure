package turnbasedrpg;

import lombok.Getter;

@Getter
public class Immigrant {

    private Passport passport;
    private EntryPermit entryPermit;

    public Immigrant() {
        System.out.println("A new immigrant has arrived.");
        passport = new Passport();
        entryPermit = new EntryPermit();
    }

}
