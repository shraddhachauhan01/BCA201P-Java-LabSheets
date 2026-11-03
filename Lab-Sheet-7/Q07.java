class Q07 {
    public static void main(String[] args) throws InterruptedException {
        Thread task = new Thread(() -> {
            long sum = 0;
            for (int i = 1; i <= 10000; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);
        });

        task.start();
        task.join();
        System.out.println("Task finished");
    }
}
