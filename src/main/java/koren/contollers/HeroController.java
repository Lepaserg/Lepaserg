package koren.contollers;

import koren.entity.Hero;
import koren.repository.HeroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {
    private final HeroRepository heroRepository;

    public HeroController(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    // получение списка всех героев
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Hero> getAllHero(){
        return heroRepository.findAll();
    }

    // получение героя по id
    @GetMapping("/{id}")
    public Hero getHeroById(@PathVariable Long id){
        return heroRepository.findById(id).orElse(null);
    }

    // добавление героя
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addHero(@RequestBody Hero hero){
        heroRepository.save(hero);
    }

    // поиск героя по имени
    @GetMapping("/search")
    public List<Hero> getHeroByName(@RequestParam String name){
        return heroRepository.findHeroesByName(name);
    }

    // удаление героя по id
    @DeleteMapping("/{id}")
    public void deleteHeroById(@PathVariable Long id){
        heroRepository.deleteById(id);
    }

}
