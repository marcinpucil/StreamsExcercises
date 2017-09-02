/*
Korzystając ze Stream.iterate, utwórz nieskończony strumień losowych liczb
— nie poprzez wywołanie Math.random, ale bezpośrednio implementując liniowy
generator kongruentny (LCG, ang. Linear Congruential Generator). W takim
generatorze zaczynasz od x0 = ziarno, a następnie generujesz xn+1 = (a xn+c)%m
dla odpowiednich wartości a, c i m. Powinieneś implementować metodę z parametrami:
a, c, m i ziarno, która zwraca Stream<Long>. Wypróbuj a = 25214903917, c = 11
i m = 248.
*/
package Excercise4;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumbersGenerator {

    public Stream<Long> generate(long a, long c, long m, long seed) {

        return Stream.iterate(seed, operand -> (a*operand+c)%m);

    }
}
