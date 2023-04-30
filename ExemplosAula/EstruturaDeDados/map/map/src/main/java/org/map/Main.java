package org.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Joao");
        aluno.put("idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");

        System.out.println(aluno);
        System.out.println(aluno2);

        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listaAluno = new ArrayList<>();

        listaAluno.add(aluno);
        listaAluno.add(aluno2);

        System.out.println(listaAluno);

        System.out.println(aluno.containsKey("Nome"));
    }
}