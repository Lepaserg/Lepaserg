package koren.contollers;

import koren.entity.Genre;
import koren.repository.GenreRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
public class GenreController {
    private final GenreRepository genreRepository;

    // конструктор
    public GenreController(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    // получение списка всех жанров
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Genre> getAllGenre(){
        return genreRepository.findAll();
    }

    // получение жанра по id
    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable Long id){
        return genreRepository.findById(id).orElse(null);
    }

    // добавление жанра
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addGenre(@RequestBody Genre genre){
        genreRepository.save(genre);
    }

    // поиск жанра по имени
    @GetMapping("/search")
    public List<Genre> getGenreByName(@RequestParam String name){
        return genreRepository.findGenresByName(name);
    }

    // удаление жанра по id
    @DeleteMapping("/{id}")
    public void deleteGenreById(@PathVariable Long id){
        genreRepository.deleteById(id);
    }

}
