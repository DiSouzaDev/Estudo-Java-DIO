package org.poliorfismoSubscrita;

public class Main {
    public static void main(String[] args) {

        ClasseMae[] classeMaes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classeMaes){
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classeMaes){
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo1();

    }
}
