class Q06 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Running: " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        });

        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("While running: " + t.isAlive());
        t.join();
        System.out.println("After finish: " + t.isAlive());
    }
}
