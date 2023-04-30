package org.calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calcular = new Calculadora();
        calcular.soma(3, 6);
        calcular.subtracao(8, 6);
        calcular.multiplicacao(2, 8);
        calcular.divisao(12, 6);

        //Metodo soma sobrecarregado
        calcular.soma(3,6,6);

    }
}