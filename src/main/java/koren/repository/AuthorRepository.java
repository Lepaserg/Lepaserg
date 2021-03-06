package koren.repository;

import koren.entity.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findAll();
    List<Author> findAuthorsByName(String name);

}