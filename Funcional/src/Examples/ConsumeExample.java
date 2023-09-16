package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumeExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//        };
//
//        numeros.stream().forEach(imprimirNumeroPar);

        //Essa é uma forma de fazer e funciona bem, reler e praticar para fixar.
        //Outra forma de se usar o Lambda no mesmo caso seria a seguinte

        numeros.forEach(n -> {
                    if (n % 2 == 0) {
                        System.out.println(n);
                    }
                }
        );

        System.out.println("\nImprimindo impares\n");
        numeros.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

        // Em uma unica linha ficaria:
        // numeros.forEach(n -> { if (n % 2 == 0) {System.out.println(n);}});
    }
}
