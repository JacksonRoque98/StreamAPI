package Desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */
public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segundoMaior = numeros.stream()
                //irá colocar em ordem decrescente
                .sorted(Comparator.reverseOrder())
                //skip irá pular o primeiro numero maior
                .skip(1)
                //irá encontrar o primeiro item
                .findFirst()
                //Retornar null se não houver segundo maior
                .orElse(null);

        System.out.println(segundoMaior);
    }
}
