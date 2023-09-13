package Desafio;

import java.util.Arrays;
import java.util.List;

/*
Desafio 3 - Verifique se todos os números da lista são positivos:
Com a ajuda da Stream API, verifique se todos os números da lista são positivos
e exiba o resultado no console.
 */
public class Desafio03 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosPositivos = numeros.stream()
                //allMatch verifica se todos são maiores que 0 e retorna um True
                //Se algum for negativo, retornará false
                .allMatch(n -> n > 0);

        if(todosPositivos){
            System.out.println("Todos são positivos");
        }else{
            System.out.println("Alguns números não são positivos");
        }

    }
}
