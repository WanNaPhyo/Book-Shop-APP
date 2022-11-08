package com.example.myapp1.dao;

import com.example.myapp1.ds.CustomerBookOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerBookOrderDao extends JpaRepository<CustomerBookOrder,Integer> {
}
