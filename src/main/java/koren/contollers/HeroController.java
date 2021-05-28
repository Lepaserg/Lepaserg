package koren.contollers;

import koren.Storage;
import koren.entity.Author;
import koren.entity.Hero;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {
    private final Storage storage;

    public HeroController(Storage storage) {
        this.storage = storage;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<List<Hero>> getAllHero(){
        return storage.getAllHero();
    }

}
