package koren.repository;

import koren.entity.Hero;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HeroRepository extends CrudRepository<Hero, Long> {
    List<Hero> findAll();
    List<Hero> findHeroesByName(String name);
}
