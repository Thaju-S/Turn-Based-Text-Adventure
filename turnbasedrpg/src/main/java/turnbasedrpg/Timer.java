package turnbasedrpg;

public class Timer extends Thread{
    public void run() {
        for (int time = 0; time < 300; time++) {
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
