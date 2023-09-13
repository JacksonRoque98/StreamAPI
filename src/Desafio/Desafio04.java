package Desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Desafio 4 - Remova todos os valores ímpares:
Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */
public class Desafio04 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       List<Integer> numerosImparesRemovidos = numeros.stream()
               //filter irá realizar um filtro por uma operação logica
               .filter(n -> n % 2 == 0)
               //sorted irá colocar em ordem crescente
               .sorted()
               //toList irá adicionar a uma lista os valores
               .toList();

        System.out.println(numerosImparesRemovidos);
    }
}
