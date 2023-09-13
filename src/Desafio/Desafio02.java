package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/*
Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
 */
public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int numerosPares = numeros.stream()
                //filter irá filtar com uma operação logica
                .filter(n -> n % 2 ==0)
                //mapToInt transforma um fluxo de objetos Integer em um fluxo de valores primitivos int
                .mapToInt(Integer::intValue)
                //sum irá realizar a soma dos valores
                .sum();

        System.out.println(numerosPares);
    }
}
