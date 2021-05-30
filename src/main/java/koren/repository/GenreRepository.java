package koren.repository;

import koren.entity.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    List<Genre> findAll();
    List<Genre> findGenresByName(String name);

}