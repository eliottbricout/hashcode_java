import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        Stream<String> stream = ParserFile.parse("./ressource/source/text.txt");
        stream = TransformFile.transform(stream);
        ParserFile.write(stream,"./ressource/reponse/text.txt");
    }
}
