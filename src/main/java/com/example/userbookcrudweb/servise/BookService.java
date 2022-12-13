package com.example.userbookcrudweb.servise;

import com.example.userbookcrudweb.entities.Book;

import java.util.List;

public interface Bookservise {

    List<Book> findAll();
    Book findId(Long id);
    Book save(Book book);



}
