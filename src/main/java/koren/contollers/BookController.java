package koren.contollers;

import koren.entity.Book;
import koren.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepository bookRepository;

    // конструктор
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // добавление книги
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        bookRepository.save(book);
    }

    // получение полного списка книг
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    // редактирование книги
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void putBook(@RequestBody Book book){
        bookRepository.updateBook(book);
    }

}
