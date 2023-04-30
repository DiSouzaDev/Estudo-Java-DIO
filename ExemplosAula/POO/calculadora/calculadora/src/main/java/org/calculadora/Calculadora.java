package org.calculadora;

public class Calculadora {

    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("Resultado: " + resultado);
    }

    public static void soma(double numero1, double numero2, double numero3){
        double resultado = numero1 + numero2 + numero3;
        System.out.println("Resultado: " + resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("Resultado: " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("Resultado: " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("Resultado: " + resultado);
    }
}
