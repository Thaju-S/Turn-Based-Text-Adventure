package turnbasedrpg;

import lombok.Getter;

@Getter
public class Immigrant {

    private Passport passport;
    private EntryPermit entryPermit;
    private Visa visa;

    public Immigrant() {
        System.out.println("\nA new immigrant has arrived.");
        passport = new Passport();
        entryPermit = new EntryPermit(passport);
        visa = new Visa(entryPermit);
    }

}
