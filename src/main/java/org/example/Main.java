package org.example;

public class Main {
    public static void main(String[] args) {
       Complex complex = new Complex(5, 8);
       complex.setX(5);
       complex.setY(3);
       System.out.println(complex.toString());
        ComplexService complexService = new ComplexService();
        Complex z1 = new Complex(9, 9);
        Complex z2 = new Complex(9, 9);

        Complex sum = complexService.add(z1, z2);
        System.out.println("Сумма: " + sum.toString());
        Complex rzn = complexService.sub(z1, z2);
        System.out.println("Разность: " + rzn.toString());
        Complex prz = complexService.mul(z1, z2);
        System.out.println("Произведение: " + prz.toString());
        Complex chast = complexService.div(z1, z2);
        System.out.println("Частное: " + chast.toString());
        double modul = complexService.getModulus(z1);
        System.out.println("Модуль z1: " + modul);
        boolean srav = complexService.isEqual(z1, z2);
        System.out.println("z1 и z2 равны: " + srav);
    }
}