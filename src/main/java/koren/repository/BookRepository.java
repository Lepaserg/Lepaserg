package koren.repository;

import koren.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
    @Query("SELECT b from Book b " +
            "join b.author a where (:title is null or :title=b.title) and (:author is null or :author=a.name) " +
            "join b.hero h where (:title is null or :title=b.title) and (:hero is null or :hero=h.name) " +
            "join b.genre g where (:title is null or :title=b.title) and (:genre is null or :genre=g.genres)")
    List<Book> findByParams(@Param("title") String title, @Param("author") String authorName, @Param("hero") String heroName, @Param("genre") String genreName);

}







//  @Query("SELECT b from Book b join b.authors a where (:title is null or :title=b.title) and (:author is null or :author=a.name) and (:author is null or :author=a.name) and (:author is null or :author=a.name)")