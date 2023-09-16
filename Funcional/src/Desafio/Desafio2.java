package Desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        //Desafio 2 - Soma de todos os pares da lista
        Integer somaPares = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
        //Integer::sum é equivalente a fazer (n1, n2) -> n1 + n2 nesse caso
        System.out.println("Soma dos numeros pares: " + somaPares);
    }
}
