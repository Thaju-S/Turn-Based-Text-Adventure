package turnbasedrpg;

public class Immigrant {

    private Passport passport;

    public Immigrant() {
        System.out.println("A new immigrant has arrived.");
        passport = new Passport();
    }

    public Passport getPassport() {
        return passport;
    }

}
