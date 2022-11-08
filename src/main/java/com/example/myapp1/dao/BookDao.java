package com.example.myapp1.dao;

import com.example.myapp1.ds.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
