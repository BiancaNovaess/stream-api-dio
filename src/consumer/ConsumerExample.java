package consumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numerosList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 200);

        //Criando o Consumer manualmente
        Consumer<Integer> imprimirPares = numero -> {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //numerosList.stream().filter(n -> n % 2 == 0)
        numerosList.forEach(imprimirPares);
    }
}
