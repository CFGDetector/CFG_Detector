public class test9 {
    private static final class Twelve implements Runnable {
        public void run() {
            System.out.println("The answer is " + (FIVE * SEVEN));
        }
    }

    private static final int SEVEN = 7;
    private static final int FIVE = 5;

    public static void main(String[] args) {
        Runnable runnable = new Twelve();
        runnable.run();
    }
}
