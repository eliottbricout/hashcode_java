import java.util.stream.Stream;

public class TransformFile {
    public static Stream<String> transform(Stream<String> stream) {
        return stream.map(s -> s.charAt(0) + " : " + s.split("").length);
    }
}
