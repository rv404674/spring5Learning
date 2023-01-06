package rahul.springframework.spring5webapp.model;

import java.util.Set;

public class Author {
    private String firstName;
    private String lastName;
    private Set<Book> books;

    // NOTE: JPA requires empty constructor
    public Author(){

    }

    public Author(String lastName, Set<Book> books) {
        this.lastName = lastName;
        this.books = books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
