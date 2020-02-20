import java.util.List;

public class Library {
    private int id;
    private int nbDay;
    private int nbBookByDay;
    private List<String> books;

    public Library(int id, int nbDay, int nbBookByDay, List<String> books) {
        this.id = id;
        this.nbDay = nbDay;
        this.nbBookByDay = nbBookByDay;
        this.books = books;
    }

    public int getNbDay() {
        return nbDay;
    }

    public void setNbDay(int nbDay) {
        this.nbDay = nbDay;
    }

    public int getNbBookByDay() {
        return nbBookByDay;
    }

    public void setNbBookByDay(int nbBookByDay) {
        this.nbBookByDay = nbBookByDay;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
