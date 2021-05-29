package koren;

import koren.entity.Author;
import koren.entity.Book;
import koren.entity.Hero;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Storage {
    private List<Book> books = new ArrayList<>();

    public void add(Book book){
        books.add(book);
    }

    public List<Book> getAll(){
        return books;
    }

    public void put(Book book){
        for (Book bk: books) {
            if (book.getId() != null && bk.getId() != null) {
                if (bk.getId().equals(book.getId())) {
                    if (bk.getTitle() != null) bk.setTitle(book.getTitle());
                    if (bk.getYear() != null) bk.setYear(book.getYear());
                    if (bk.getNumberOfPages() != 0) bk.setNumberOfPages(book.getNumberOfPages());
                    if (bk.getHeroes() != null) bk.setHeroes(book.getHeroes());
                    if (bk.getAuthor() != null) bk.setAuthor(book.getAuthor());
                    if (bk.getGenres() != null) bk.setGenres(book.getGenres());
                }
            }
        }
    }

    public List<Author> getAllAuthor() {
        List<Author> aut = new ArrayList<>();
        for (Book bk: books) {
            aut.addAll(bk.getAuthor());
        }
        return aut;
    }

    public List<List<Hero>> getAllHero() {
        List<List<Hero>> her = new ArrayList<>();
        for (Book bk: books) {
           her.add(bk.getHeroes());
        }
        return her;
    }

    public List<Book> searchBook() {
        List<Book> filter = new ArrayList<>();

        return filter;
    }

}
