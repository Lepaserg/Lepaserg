package koren.repository;

import koren.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository {
    List<Book> findAll();
    Book updateBook(Book book);

}