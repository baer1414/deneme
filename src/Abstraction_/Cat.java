package Abstraction_;

public  class Cat extends Animal {//concrete

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kediler yerler");
    }

    @Override
    public void move() {
        System.out.println("kediler koşucudur ");

    }
}
