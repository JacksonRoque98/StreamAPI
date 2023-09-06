package Example;

/*
Representa uma função que aceita um argumento do tipo T e retorna um valor booleano
É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> listaDePalavras = Arrays.asList("Java", "Kotlin", "JavaScript", "Python", "c", "Go", "Ruby");

        //Criar um Predicate parar verificar se a palavra possui mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usa o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        //Imprime cada palavra que passou no filtro
        listaDePalavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(p -> System.out.println(p));

        //Usando o Stream com Lambda para realizar a mesma operação acima.
        listaDePalavras.stream()
                .filter(p -> p.length()>5)
                .forEach(p -> System.out.println(p));
    }
}
