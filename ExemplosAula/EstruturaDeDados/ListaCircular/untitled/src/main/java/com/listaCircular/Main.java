package com.listaCircular;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("C0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("C1");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("C2");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("C3");
        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(0));

        for (int i = 0; i < 20; i++){
            System.out.println(minhaListaCircular.get(i));
        }
    }

}