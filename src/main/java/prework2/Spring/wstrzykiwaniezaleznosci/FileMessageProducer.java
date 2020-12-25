package prework2.Spring.wstrzykiwaniezaleznosci;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileMessageProducer implements MessageProducer {
    @Override
    public String getMessage() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("message.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = "";
        if (lines != null)
            result = lines.stream().reduce(result, (a, b) -> a + b);
        return result;
    }

//    W klasie FileMessageProducer wczytujemy wiersze tekstu z pliku message.txt do listy lines, a następnie wykonujemy
//    jej redukcję do jednego Stringa, tak aby spełnić wymagania zwracanego typu metody.
}
