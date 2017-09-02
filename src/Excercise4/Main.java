package Excercise4;
/*
Korzystając ze Stream.iterate, utwórz nieskończony strumień losowych liczb
— nie poprzez wywołanie Math.random, ale bezpośrednio implementując liniowy
generator kongruentny (LCG, ang. Linear Congruential Generator). W takim
generatorze zaczynasz od x0 = ziarno, a następnie generujesz xn+1 = (a xn+c)%m
dla odpowiednich wartości a, c i m. Powinieneś implementować metodę z parametrami:
a, c, m i ziarno, która zwraca Stream<Long>. Wypróbuj a = 25214903917, c = 11
i m = 248.
*/

import java.io.IOException;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        NumbersGenerator numbersGenerator = new NumbersGenerator();
        System.out.println(numbersGenerator.generate(25214903917L, 11, 248, 1).limit(100).collect(Collectors.toList()));
    }
}