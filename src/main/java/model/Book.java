package model;

public class Book {
    private int idBook;
    private String title;
    private String autor;
    private Boolean avaiable;

    public Book(int idBook, String title, String autor, Boolean avaiable) {
        this.idBook = idBook;
        this.title = title;
        this.autor = autor;
        this.avaiable = avaiable;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getAvaiable() {
        return avaiable;
    }

    public void setAvaiable(Boolean avaiable) {
        this.avaiable = avaiable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (idBook != book.idBook) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return autor != null ? autor.equals(book.autor) : book.autor == null;
    }

    @Override
    public int hashCode() {
        int result = idBook;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
