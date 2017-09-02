package Excercise3;
/*
Załóżmy, że masz tablicę int[] wartości = { 1, 4, 9, 16 }. Czym będzie
Stream.of(wartości)? Jak otrzymać strumień wartości typu int?
*/

import Excercise1.LongWords;

import java.io.IOException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] tableOfInts = {1,4,9,16};
        IntStream stream = IntStream.of(tableOfInts);
        stream.forEach(System.out::println);
}}
