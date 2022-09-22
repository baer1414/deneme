package Abstraction_;

public abstract class Geometri {

   String nameOfShape;

    public Geometri(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    abstract double area();
   abstract String info();

   String getNameOfShape(){
       return nameOfShape;

    }

}
class Circle extends Geometri{
    double radius;
    public Circle(String nameOfShape, double radius) {
        super(nameOfShape);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    String info() {
        return "name of shame is "+nameOfShape+" Area is "+area();
    }
}
class Square extends Geometri{

    double kenar;

    public Square (String nameOfShape,double kenar) {
        super(nameOfShape);
        this.kenar=kenar;
    }

    @Override
    double area() {
        return Math.pow(kenar,2);
    }

    @Override
    String info() {
        return "name of shame is "+nameOfShape+" Area is "+area();
    }
}
class Maintest{
    public static void main(String[] args) {
        Circle c=new Circle("daire",2);
        System.out.println(c.info());
        Square s=new Square("kare",5);
        System.out.println(s.info());

    }
}