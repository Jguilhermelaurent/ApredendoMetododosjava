package com.dio.sobrecargajava;

public class Quadrilatero {

    public static void area(double lado){

        System.out.println("Área do quadrado :"+ lado * lado);
    }

    public static void area(double lado1,double lado2){
        System.out.println("Área do Retangulo :" + lado1*lado2);
    }
    public  static  void area(double baseMaior, double baseMenor , double altura){
        System.out.println("Área dp Trapezio :"+ ((baseMaior+baseMenor)*altura)/2 );
    }


}
