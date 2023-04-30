package com.ListaDuplamenteEncadeada;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaencadeada = new ListaDuplamenteEncadeada<>();

        minhaListaencadeada.add("C1");
        minhaListaencadeada.add("C2");
        minhaListaencadeada.add("C3");
        minhaListaencadeada.add("C4");
        minhaListaencadeada.add("C5");
        minhaListaencadeada.add("C6");
        minhaListaencadeada.add("C7");

        System.out.println(minhaListaencadeada);

        minhaListaencadeada.remove(3);
        minhaListaencadeada.add(3,"99");
        System.out.println(minhaListaencadeada);
        System.out.println(minhaListaencadeada.get(3));
    }

}
