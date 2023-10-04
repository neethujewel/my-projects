package com.example.Library.book;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1")


public class BookController {
    @Autowired
    BookRepo BookRepo;



    @GetMapping("/book")
    public Iterable<BooksDetails>getBookDetails(String bookName){
        return com.example.Library.book.BookRepo.findByName(bookName);

    }
    
    @GetMapping("/id")
    public Iterable<BooksDetails>getBookDetails(int id){
       return com.example.Library.book.BookRepo.getById(id);
    }
    
    @GetMapping("/author")
    public Iterable<BooksDetails>getBooksDetails(String author) {
        return com.example.Library.book.BookRepo.findByAuthor(author);

    }
@GetMapping("/find")
public Iterable<BooksDetails>getBooksDetails(){
 return BookRepo.findAll();
}

@PostMapping("/add")
    public void addBook(BooksDetails booksDetails){
    BookRepo.save(booksDetails);
}

@PutMapping("/update")
 public void updateDetails(BooksDetails booksDetails){
        BookRepo.save(booksDetails);
}
@DeleteMapping("/delete")
    public void deleteDetails(BooksDetails booksDetails){
       BookRepo.deleteById(booksDetails.id);
}



}


