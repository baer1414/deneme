package Polymorphism_;

public class Car implements Veichle {
    @Override
    public void start() {
        System.out.println("car start");

    }

    @Override
    public void stop() {
        System.out.println("car stop");

    }
    public int durmaMesafesi(){
        return 20;
    }
}
