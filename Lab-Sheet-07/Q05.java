import java.util.Random;

class Q05 {
    public static void main(String[] args) {
        String[] names = {"Reader", "Writer", "Logger"};

        for (String name : names) {
            Thread t = new Thread(() -> {
                try {
                    Thread.sleep(new Random().nextInt(501));
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println(Thread.currentThread().getName() + " is running.");
            }, name);
            t.start();
        }
    }
}
