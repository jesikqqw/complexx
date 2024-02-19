package org.example;

public class ComplexService {
    public Complex add(Complex z1, Complex z2) {
        double x = z1.getX() + z2.getX();
        double y = z1.getY() + z2.getY();
        return new Complex(x, y);
    }
    public Complex sub(Complex z1, Complex z2) {
        double x = z1.getX() - z2.getX();
        double y = z1.getY() - z2.getY();
        return new Complex(x, y);
    }
    public Complex mul(Complex z1, Complex z2) {
        double x = z1.getX() * z2.getX() - z1.getY() * z2.getY();
        double y = z1.getX() * z2.getY() + z2.getX() * z1.getY();
        return new Complex(x, y);
    }
    public Complex div(Complex z1, Complex z2) {
        double divisor = Math.pow(z2.getX(), 2) + Math.pow(z2.getY(), 2);
        double x = (z1.getX() * z2.getX() + z1.getY() * z2.getY()) / divisor;
        double y = (z1.getY() * z2.getX() - z1.getX() * z2.getY()) / divisor;
        return new Complex(x, y);
    }
    public double getModulus(Complex z) {
        return Math.sqrt(Math.pow(z.getX(), 2) + Math.pow(z.getY(), 2));
    }

    public boolean isEqual(Complex z1, Complex z2) {
        return (z1.getX() == z2.getX()) && (z1.getY() == z2.getY());
    }
}
