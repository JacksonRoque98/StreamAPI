package Desafio;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos
(não se repetem) e exiba o resultado no console.
 */
public class Desafio09 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> numerosDistintos = new HashSet<>(numeros);

        boolean todosDistintos = numeros.size() == numerosDistintos.size();

        if (todosDistintos) {
            System.out.println("Todos os números na lista são distintos.");
        } else {
            System.out.println("Alguns números na lista se repetem.");
        }

    }
}
