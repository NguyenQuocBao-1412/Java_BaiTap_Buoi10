package Bai1;

public class PTBac2 {
    private double a, b, c;

    public PTBac2() {}
    
    public PTBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return this.b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return this.c;
    }

    public double tinhDelta() {
        return this.b * this.b - (4 * this.a * this.c);
    }

    public void tinhNghiem() {
        double delta = tinhDelta();
        double x1, x2;

        if (delta < 0) {
            System.out.println("Chương trình vô nghiệm!");
        }
        else if(delta == 0) {
            System.out.println("Phương trình có nghiệm kép = " + (-this.b / 2 * this.a));
        }
        else {
            x1 = (-b + Math.sqrt(delta) / 2 * this.a);
            x2 = (-b - Math.sqrt(delta) / 2 * this.a);
            System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + ", x2 = " + x2);
        }
    }

}
