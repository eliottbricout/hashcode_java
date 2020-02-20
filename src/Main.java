import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        String a = "";
        String b = "b_read_on";
        String c = "c_incunabula";
        String d = "d_tough_choices";
        String e = "e_so_many_books";
        String f = "f_libraries_of_the_world";
        Stream<String> stream = ParserFile.parse("./ressource/source/" + d + ".txt");
        stream = TransformFile.transform(stream);
        ParserFile.write(stream,"./ressource/reponse/" + d + ".txt");
    }
}
