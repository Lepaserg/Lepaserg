package koren.contollers;

import koren.entity.Author;
import koren.repository.AuthorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorRepository authorRepository;

    // конструктор
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    // получение списка всех авторов
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Author> getAllAuthor(){
        return authorRepository.findAll();
    }

    // получение автора по id
    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id){
        return authorRepository.findById(id).orElse(null);
    }

    // добавление автора
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addAuthor(@RequestBody Author author){
        authorRepository.save(author);
    }

    // поиск автора по имени
    @GetMapping("/search")
    public List<Author> getAuthorByName(@RequestParam String name){
        return authorRepository.findAuthorsByName(name);
    }

    // удаление автора по id
    @DeleteMapping("/{id}")

    public void deleteAuthorById(@PathVariable Long id){
        authorRepository.deleteById(id);
    }

}
