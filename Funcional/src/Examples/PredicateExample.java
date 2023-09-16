package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "kotlin", "c++", "c", "c#", "javascript");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

//        Predicate<String> maisDeDoisCaracteres = palavra -> palavra.length() > 2; posso fazer assim e passar o Predicate como parametro no filter

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
        System.out.println("\n-- + de 2 --\n");

        palavras.stream().filter(s -> s.length() > 2).forEach(System.out::println);

        System.out.println("\n-- Menor que 5 --\n");

        palavras.stream().filter(s -> s .length() < 5).forEach(System.out::println);
        //Ou posso criar o predicate ja no parametro como um Lambda
    }
}
