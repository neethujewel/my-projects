package com.example.Library.book;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")


public class BooksDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @Column
    String bookname;
    @Column
    String author;

    public BooksDetails() {

    }
}
