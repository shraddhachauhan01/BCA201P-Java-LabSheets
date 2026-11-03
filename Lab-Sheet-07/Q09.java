class Q09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            final int number = i;
            Thread t = new Thread(() -> {
                for (int j = 1; j <= 3; j++) {
                    System.out.println("Thread " + number + " is printing " + j);
                }
            }, "Thread-" + i);
            t.setPriority(i * 2);
            System.out.println(t.getName() + " priority: " + t.getPriority());
            t.start();
        }
    }
}
