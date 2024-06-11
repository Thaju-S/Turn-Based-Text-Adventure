package turnbasedrpg;

import java.util.Random;

import lombok.Getter;

@Getter
public class Passport {

    private String name;
    private int[] date;
    private int number;

    public Passport() {
        this.name = Info.createName();
        this.date = Info.getDate();
        this.number = new Random().nextInt(10000, 99999);
    }

    public String getDateString() {
        return "" + date[0] + "-" + date[1] + "-" + date[2];
    }

}
