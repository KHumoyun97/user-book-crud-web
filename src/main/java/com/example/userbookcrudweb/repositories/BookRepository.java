package com.example.userbookcrudweb.repositories;

import com.example.userbookcrudweb.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  Bookrepositories extends JpaRepository<Book, Long> {

}
