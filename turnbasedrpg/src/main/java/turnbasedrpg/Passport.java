package turnbasedrpg;

public class Passport {

    private String name;
    private int[] date;

    public Passport() {
        this.name = Info.createName();
        this.date = Info.getDate();
    }

    public String getName() {
        return name;
    }

    public int[] getDate() {
        return date;
    }

    public String getDateString() {
        return "" + date[0] + "-" + date[1] + "-" + date[2];
    }

}
