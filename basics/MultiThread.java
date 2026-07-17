
class Loop1 implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("LOOP - 1");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

class Loop2 implements Runnable {

    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("LOOP - 2");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

public class MultiThread {

    public static void main(String s[]) {

        Runnable obj1 = new Loop1();
        Runnable obj2 = new Loop2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }

}
