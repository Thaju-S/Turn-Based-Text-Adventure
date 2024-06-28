package turnbasedrpg;

import java.util.Random;

import lombok.Getter;

@Getter
public class Visa {

    private String type;
    private String name;

    public Visa(EntryPermit entryPermit) {
        Random r = new Random();
        this.type = (r.nextInt(15) == 1 ? Info.travel[r.nextInt(Info.travel.length)] : entryPermit.getReason());
        this.name = (r.nextInt(15) == 1 ? Info.createName() : entryPermit.getName());
    }

}
