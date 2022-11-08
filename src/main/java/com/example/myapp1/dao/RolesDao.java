package com.example.myapp1.dao;

import com.example.myapp1.ds.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesDao extends JpaRepository<Roles,Integer> {
    Optional<Roles> findRolesByRoleName(String roleNames);
}
