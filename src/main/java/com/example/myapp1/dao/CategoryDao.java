package com.example.myapp1.dao;

import com.example.myapp1.ds.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
