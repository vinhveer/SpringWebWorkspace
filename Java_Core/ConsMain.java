public class ConsMain {
    private int x;
    ConsMain() {
        System.out.println("Constructor is starting ...");
        x = 100;
    }

    public static void main(String[] args) {
        System.out.println("Program is starting ...");
        ConsMain obj = new ConsMain();
        System.out.println("X = " + obj.x);
    }
}
