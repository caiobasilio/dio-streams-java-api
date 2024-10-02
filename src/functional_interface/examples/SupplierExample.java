package src.functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Seja bem vindo!!";

        List<String> listaSaudacoes = Stream.generate(() -> "Seja bem vindo!!!")
                .limit(3)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
