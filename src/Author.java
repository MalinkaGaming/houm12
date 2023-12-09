public class Author {
    private String authors;
    private String surname;

    public Author(String authors, String surname) {
        this.authors = authors;
        this.surname = surname;
    }

    public String getAuthors() {
        return this.authors;
    }

    public String getSurname() {
        return this.surname;
    }
}