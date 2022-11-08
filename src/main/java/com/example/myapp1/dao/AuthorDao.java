package com.example.myapp1.dao;

import com.example.myapp1.ds.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author,Integer> {
}
