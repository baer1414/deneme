package Interface_;

public interface Geometri {
    double gerArea();
    default double getPrimer(double... sides){
        double primeter=0;
        for (double side:sides) {
            primeter+=side;
        }
        return primeter;
    }
}
class Square implements Geometri{
    double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double gerArea() {
        return Math.pow(a,2);
    }
}class run{
    public static void main(String[] args) {
      Square s=new Square(5);
        System.out.println("Area "+s.gerArea());
        System.out.println("Primer "+s.getPrimer(5, 5,5,5));


    }}