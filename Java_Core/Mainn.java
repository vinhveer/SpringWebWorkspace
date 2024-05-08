public class Mainn {
    private static void cc() {
        System.out.println("Day la phuong thuc!");
    }

    
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        cc();
        Helloc obj = new Helloc();
        obj.cc2();
    }
}

class Helloc {
    public void cc2() {
        System.out.println("Day la phuong thuc trong class Helloc");
    }
}