/*
Korzystając z metody String.codePoints, zaimplementuj metodę testującą, czy ciąg
znaków jest słowem złożonym jedynie z liter. (Podpowiedź: Character.isAlphabetic).
Korzystając z tego samego podejścia, zaimplementuj metodę sprawdzającą, czy ciąg
znaków jest poprawnym identyfikatorem języka Java.
*/
package Excercise6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static boolean isOnlyAlphabetic(String characterString) {
                return Stream.of(characterString).map(s -> s.split(""))
                        .flatMap(Arrays::stream)
                        .map(s -> s.charAt(0))
                        .allMatch(s -> Character.isAlphabetic((int) s));
    }
    public static void main(String[] args) {
        String characterString = "test";
        System.out.println(isOnlyAlphabetic(characterString));
    }
}