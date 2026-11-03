class Q08 {
    public static void main(String[] args) {
        Thread high = new Thread(() -> System.out.println("High priority thread"));
        Thread low = new Thread(() -> System.out.println("Low priority thread"));

        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        System.out.println("High thread priority: " + high.getPriority());
        System.out.println("Low thread priority: " + low.getPriority());

        high.start();
        low.start();
    }
}
