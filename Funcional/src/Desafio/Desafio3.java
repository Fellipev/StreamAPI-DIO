package Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean positivo = numeros.stream().allMatch(n -> n > 0);

        if (positivo) {
            System.out.println("Todos os numeros da lista sao positivos!");
        } else {
            System.out.println("Existem numeros negativos na lista!");
        }
    }
}
