class Q14 {
    public static void main(String[] args) {
        final Object Lock1 = new Object();
        final Object Lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread 1 acquired Lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                synchronized (Lock2) {
                    System.out.println("Thread 1 acquired Lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread 2 acquired Lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                synchronized (Lock1) {
                    System.out.println("Thread 2 acquired Lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
