package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(1, 4));
        System.out.println(calc.mult(3, 3));
        System.out.println(calc.mult(2, 3));
    }
}
