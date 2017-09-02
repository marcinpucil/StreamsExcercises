package Excercise1;
/*
Sprawdź, czy zapytanie o pięć dugich słów spowoduje wywołanie metody filter
po znalezieniu piątego długiego słowa. Po prostu rejestruj każde wywołanie metody.
*/

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        LongWords longWords = new LongWords();
        List<String> listOf5LongWords = longWords.get5Words();
    }
}
