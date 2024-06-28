package turnbasedrpg;

public class Timer extends Thread{

    private int time;

    public Timer(int time) {
        this.time = time;
    }

    public void run() {

        for (int t = 0; t < time; t++) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {}
        }
    }
}
