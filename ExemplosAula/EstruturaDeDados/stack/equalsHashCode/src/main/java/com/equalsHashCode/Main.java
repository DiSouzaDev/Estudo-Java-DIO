package com.equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> carroStack = new Stack<>();

        carroStack.push(new Carro("Ford"));
        carroStack.push(new Carro("Chevrolet"));
        carroStack.push(new Carro("Fiat"));

        System.out.println(carroStack);
        System.out.println(carroStack.pop());
        System.out.println(carroStack);

        System.out.println(carroStack.peek());
        System.out.println(carroStack);

        System.out.println(carroStack.empty());

    }
}
