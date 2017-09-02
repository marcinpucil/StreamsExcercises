package Excercise2;
/*
Zmierz różnicę pomiędzy zliczaniem długich słów za pomocą parallelStream
i stream. Wywołaj System.currentTimeMillis przed wywołaniem i po nim, a następnie
wyświetl różnicę. Wykorzystaj dłuższy tekst (na przykład Wojnę i pokój),
jeśli masz szybki komputer.
*/

import Excercise1.LongWords;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        LongWords longWords = new LongWords();
        long start = System.currentTimeMillis();
        longWords.countLongWords(s -> s.length() > 10);
        System.out.println("Serial stream time:" + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        longWords.countLongWordsWithParallelStream(s -> s.length() > 10);
        System.out.println("Parallel stream time:" + (System.currentTimeMillis() - start));
    }
}
