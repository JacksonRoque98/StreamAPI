package Example;

/*
Respresenta uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //Usar o Supplier com expressão Lambda
        Supplier<String> saudacao = () -> "Hello World";

        //Usar o Supplier para obter uma lista de  saudações
        List<String> listaDeSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //Imprimindo a Saudação gerada
        listaDeSaudacoes.forEach(s -> System.out.println(s));
    }
}
