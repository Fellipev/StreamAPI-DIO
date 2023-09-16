package Examples.Exs;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Numeros {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Originais!");
        numeros.stream().map(n -> n).forEach(System.out::println);

        System.out.println("\nPares!\n");
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("\nImpares!\n");
        numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

        System.out.println("\nDobro!\n");
        numeros.stream().map(n -> n * 2).forEach(System.out::println);

        System.out.println("\nAo quadrado!\n");
        numeros.stream().map(n -> n * n).forEach(System.out::println);

        System.out.println("\nSoma de toda a lista!\n");
        System.out.println(numeros.stream().reduce(0, (n1, n2) -> n1 + n2));
    }
}
