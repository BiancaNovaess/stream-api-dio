package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    /*
     * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
     * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */

    public static void main(String[] args) {
        List<String> linguagensProgramacao = Arrays.asList("javascript", "java", "kotlin", "c++", "c#", "python", "c", "typescript");

        Predicate<String> maisDeCincoCaracteres = linguagem -> linguagem.length()>5;

        linguagensProgramacao.stream()
                .filter(l -> l.length()>5)
                .forEach(System.out::println);

    }
}
