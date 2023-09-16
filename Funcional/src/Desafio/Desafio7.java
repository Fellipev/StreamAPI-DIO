package Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> listaDecrescente = numeros.stream().sorted((a,b) -> b.compareTo(a)).toList();

        Integer segundoMaiorNumero = listaDecrescente.get(1);
        System.out.println("Segundo maior numero da lista: " + segundoMaiorNumero);
    }
}
