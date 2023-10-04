package com.example.Library.book;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends CrudRepository<BooksDetails,Integer> {


    static Iterable<BooksDetails> findByName(String bookName) {
        return null;
    }

    static Iterable<BooksDetails> getById(int id) {
        return null;
    }

    static Iterable<BooksDetails> findByAuthor(String author) {
        return null;
    }
}
