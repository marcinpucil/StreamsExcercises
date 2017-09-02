package Excercise1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LongWords {

    private List<String> txtFile;

    public LongWords() throws IOException {
        readTxtFile();
    }

    public void readTxtFile() throws IOException {
        String txtFile;
        txtFile = new String(Files.readAllBytes(
                Paths.get("D:/nauka programowania/NAUKA.txt")),
                Charset.forName("windows-1250"));
        this.txtFile = Arrays.asList(txtFile.split("\\R+| +"));
    }

    public long countLongWordsWithParallelStream(Predicate<String> stringPredicate) {
        return txtFile.parallelStream()
                .filter(stringPredicate)
                .count();
    }

    public long countLongWords(Predicate<String> stringPredicate) {
        return txtFile.stream()
                .filter(stringPredicate)
                .count();
    }

    public List<String> get5Words() {
        return(txtFile.parallelStream()
                .filter(s -> s.length()>10)
                .limit(5)
                .peek(s -> System.out.println(s))
                .collect(Collectors.toList()));
    }
}