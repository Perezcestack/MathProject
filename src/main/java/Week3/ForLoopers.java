package Week3;

public class ForLoopers {
    public static void main(String[] args) throws InterruptedException {
        for(int countdown = 10;countdown > 0; countdown--) {
            Thread.sleep(1000);
            System.out.println(countdown);

        }
        Thread.sleep(1000);
        System.out.println("Launch");
    }
}
