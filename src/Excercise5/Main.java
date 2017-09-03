/*
Metoda litery z podrozdziału 8.3, „Metody filter, map i flatMap”, była odrobinę
niezgrabna, ponieważ wypełniała najpierw tablicę typu ArrayList, a następnie
zamieniała ją na strumień. Napisz zamiast niej jednoliniowe wyrażenie korzystające
ze strumieni. Utwórz mapę wartości typu int od 0 do s.length()-1 za pomocą
odpowiedniego wyrażenia lambda.
*/
package Excercise5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Main {

    public static Stream<String> litery(String s) {
        List<String> wynik = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            wynik.add(s.substring(i, i + 1));
        return wynik.stream();
    }

    public static Stream<String> literyNowe(String s) {
        return Stream.of(s)
                .map((s1) -> s1.split(""))
                .flatMap(Arrays::stream);
    }
    public static void main(String[] args) throws IOException {

        System.out.println(litery("cos").collect(Collectors.toList()));
        System.out.println(literyNowe("cos").collect(Collectors.toList()));
    }
}