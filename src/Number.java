public class Number {

    private double a;
    private double b;
    private double c;
    private double d;

    public Number() {
    }

    public Number(double a, double b, double c, double d) {
        this.setA(a);
        this.setB(b);
        this.setC(c);
        this.setD(d);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
}
