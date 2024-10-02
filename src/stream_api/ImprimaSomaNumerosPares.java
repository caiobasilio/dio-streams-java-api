package src.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ImprimaSomaNumerosPares {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numerosPares = numero -> numero % 2 == 0;
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream().filter(numerosPares).reduce(0, somar);

        System.out.println(resultado);
    }

}
