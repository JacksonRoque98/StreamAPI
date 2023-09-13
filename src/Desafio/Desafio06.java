package Desafio;

import java.util.Arrays;
import java.util.List;

/*
Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e
 exiba o resultado no console.
 */
public class Desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQueDez = numeros.stream()
                //irá retornar true se existir algum numero maior que 10 dentro da lista.
                .allMatch(n -> n > 10);

        if(maiorQueDez){
            System.out.println("Exite números maiores que 10 na lista!");
        }else{
            System.out.println("Não existe número maior que 10 na lista!");
        }
    }
}
