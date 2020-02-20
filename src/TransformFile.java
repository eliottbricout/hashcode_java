import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransformFile {
    public static Stream<String> transform(Stream<String> stream) {
        List<List<String>> list = stream.map(s -> Arrays.asList(s.split(" "))).collect(Collectors.toList());
        List<Library> libraries = new ArrayList<>();
        int nbDay = Integer.parseInt(list.get(0).get(2));
        for (int i = 2; i < list.size(); i += 2) {
            libraries.add(new Library(
                    i / 2 - 1,
                    Integer.parseInt(list.get(i).get(1)),
                    Integer.parseInt(list.get(i).get(2)),
                    list.get(i + 1)
            ));
        }
        return Stream.concat(
                Stream.of(libraries.size() + ""),
                libraries.stream().flatMap(l -> TransformFile.transformLibrary(l, nbDay))
        );
    }

    public static Stream<String> transformLibrary(Library library, int nbDay) {
        int nbBooks = Math.min(
                (nbDay - library.getNbDay()) * library.getNbBookByDay(),
                library.getBooks().size()
        );
        if(nbBooks <= 0) {
            return Stream.empty();
        }
        return Stream.of(
                library.getId() + " " + nbBooks,
                slice(library.getBooks(), nbBooks)
        );
    }

    public static String slice(List<String> books, int nbBooks) {
        return String.join(" ", books.subList(0, nbBooks));
    }
}
