package rahul.springframework.spring5webapp.boostrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rahul.springframework.spring5webapp.model.Author;
import rahul.springframework.spring5webapp.model.Book;
import rahul.springframework.spring5webapp.repositories.AuthorRepository;
import rahul.springframework.spring5webapp.repositories.BookRepository;

// NOTE: spring will run instances of CommandLineRunner
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Verma");
        Book ddd = new Book("Domain Driven Design", "12342");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Dev without EJB", "sdfsfs");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());
    }
}
