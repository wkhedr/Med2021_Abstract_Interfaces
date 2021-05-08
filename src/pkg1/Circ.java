package pkg1;

public class Circ implements Shape, MyInteface{
    private double r;
    private double PI = 3.14;

    public Circ(double r) {
        this.r = r;
        System.out.println(x);
    }

    @Override
    public double GetArea() {
        return PI*r*r;
    }

    @Override
    public void MyFun() {

    }
}
