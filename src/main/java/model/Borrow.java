package model;

public class Borrow {
    private int id;
    private int idUser;
    private int idBook;

    public Borrow(int id, int idUser, int idBook) {
        this.id = id;
        this.idUser = idUser;
        this.idBook = idBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Borrow borrow = (Borrow) o;

        if (id != borrow.id) return false;
        if (idUser != borrow.idUser) return false;
        return idBook == borrow.idBook;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idUser;
        result = 31 * result + idBook;
        return result;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", idBook=" + idBook +
                '}';
    }
}
