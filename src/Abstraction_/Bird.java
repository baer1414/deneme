package Abstraction_;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kuslar yer");
    }

    @Override
    public void move() {
        System.out.println("kuşlar uçar");

    }
}
