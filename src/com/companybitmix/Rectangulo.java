package com.companybitmix;

public class Rectangulo {
    int lado ;
    int base ;
    public Rectangulo (int a, int b){
        lado = a;
        base = b;
    }
    public int perimetro(){
        int perimetro = lado*2 + base*2;
        return perimetro;
    }
    public int area(){
        int area = lado*base;
        return area;
    }
}
