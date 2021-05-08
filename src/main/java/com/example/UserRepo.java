package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepo extends JpaRepository<UserTable, Integer> {

        List<UserTable> findByName(String name);
        List<UserTable> findAll();
         }
