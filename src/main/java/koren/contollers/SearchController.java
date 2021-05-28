package koren.contollers;

import koren.Storage;
import koren.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private final Storage storage;

    public SearchController(Storage storage) {
        this.storage = storage;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Book> searchBook(@RequestBody Book book){
        return  storage.searchBook();
    }

}
