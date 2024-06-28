package turnbasedrpg;

import java.util.Random;

public class Visa {

    private String type;
    private String name;

    public Visa(EntryPermit entryPermit) {
        Random r = new Random();
        if (r.nextInt(15) == 1) {
            this.type = Info.travel[r.nextInt(Info.travel.length)];
        }
        else {
            this.type = entryPermit.getReason();
        }
        if (r.nextInt(15) == 1) {
            this.name = Info.createName();
        }
        else {
            this.name = entryPermit.getName();
        }
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
