package TITVExample.Animal;

public class main {
    public static void main(String[] args) {
        cat Cat = new cat("Meo", "10");
        Cat.meow();
        Cat.eating();

        Dog dog = new Dog("Gau", "19");
        dog.bark();
        dog.eating();
    }
}
