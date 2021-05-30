package koren.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "book")
@NoArgsConstructor
public class Book {
    @Id
//    @GeneratedValue
    private Long id;
    private String title;
    private String year;
    private int numberOfPages;
    private List<Hero> heroes;
    private List<Author> authors;
    private List<Genre> genres;
}