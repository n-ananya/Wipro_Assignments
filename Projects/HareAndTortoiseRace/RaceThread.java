public class RaceThread extends Thread {
    private static volatile boolean raceOver = false;

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int meter = 1; meter <= 100; meter++) {
            if (raceOver) break;

            System.out.println(getName() + " ran " + meter + " meters");

            // Hare sleeps at 60 meters
            if (getName().equals("Hare") && meter == 60) {
                try {
                    System.out.println("Hare is sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                break;
            }

            if (meter == 100 && !raceOver) {
                raceOver = true;
                System.out.println("🏁 " + getName() + " wins the race!");
            }
        }
    }
}
