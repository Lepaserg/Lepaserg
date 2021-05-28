package koren.contollers;

import koren.Storage;
import koren.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final Storage storage;

    public BookController(Storage storage) {
        this.storage = storage;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book){
        storage.add(book);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAll(){
        return storage.getAll();
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void putBook(@RequestBody Book book){
        storage.put(book);
    }

}
