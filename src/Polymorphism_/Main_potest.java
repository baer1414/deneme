package Polymorphism_;

public class Main_potest {
    public static void main(String[] args) {
      SporCar kırmızımelek=new SporCar();
      kırmızımelek.stop();
      kırmızımelek.speed();
      kırmızımelek.start();
      Car beyazmelek=new SporCar();
        System.out.println(beyazmelek.durmaMesafesi());
        beyazmelek.start();
        beyazmelek.stop();
        System.out.println(kırmızımelek.getClass().getSimpleName());
    }
}
