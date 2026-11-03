class Q02 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Shraddha");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        };
        Thread t = new Thread(task);
        t.start();
    }
}
