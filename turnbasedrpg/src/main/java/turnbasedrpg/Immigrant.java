package turnbasedrpg;

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

    public Passport getPassport() {
        return passport;
    }

    public EntryPermit getEntryPermit() {
        return entryPermit;
    }

    public Visa getVisa() {
        return visa;
    }

}
