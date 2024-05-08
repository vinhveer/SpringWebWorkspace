package TITVExample.Animal;

public class cat extends Animal{
    public cat(String name, String age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("Meowww");
    }

    @Override
    public void eating() {
        super.eating();
        System.out.println("Hello#2");
    }
}
