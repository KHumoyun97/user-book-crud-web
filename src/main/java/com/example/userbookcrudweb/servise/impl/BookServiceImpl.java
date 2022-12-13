package com.example.userbookcrudweb.servise.impl;

import com.example.userbookcrudweb.entities.Book;
import com.example.userbookcrudweb.repositories.Bookrepositories;
import com.example.userbookcrudweb.servise.Bookservise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public  class Bookserviseimple implements Bookservise {
      public final Bookrepositories bookrepositories;

    @Override
    public List<Book> findAll() {
        return bookrepositories.findAll();
    }

    @Override
    public Book findId(Long id) {
        return bookrepositories.findById(id).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return bookrepositories.save(book);
    }
}
