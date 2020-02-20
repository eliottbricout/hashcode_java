import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParserFile {

    public static Stream<String> parse(String path) throws IOException {
        Path filePath = Paths.get(path);
        return Files.readString(filePath).lines();
    }

    public static void write(Stream<String> stream, String path) throws IOException {
        Path filePath = Paths.get(path);
        byte[] bytes = stream.collect(Collectors.joining("\n")).getBytes();
        Files.write(filePath, bytes);
    }
}
