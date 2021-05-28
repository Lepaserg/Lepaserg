package koren.contollers;

import koren.Storage;
import koren.entity.Author;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final Storage storage;

    public AuthorController(Storage storage) {
        this.storage = storage;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<List<Author>> getAllAuthor(){
        return storage.getAllAuthor();
    }

}
