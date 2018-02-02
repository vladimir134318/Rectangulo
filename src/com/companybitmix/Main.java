package com.companybitmix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("ingrese la base del rectangulo");
        int n = in.nextInt();
        System.out.println("ingrese el lado del rectangulo");
        int m = in.nextInt();
        Rectangulo a = new Rectangulo(n, m);
        System.out.println("el area del rectangulo es " + a.area());
        System.out.println("el perimetro del rectangulo es " + a.perimetro());
    }
}
