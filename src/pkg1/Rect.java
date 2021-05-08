package pkg1;

public class Rect implements Shape, MyInteface{
    private double h,w;

    public Rect(double h, double w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public double GetArea() {

        return h*w;
    }

    @Override
    public void MyFun() {

    }
}
