package com.trainibit.labs.spring_boot_jpa.repository;

import com.trainibit.labs.spring_boot_jpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // JpaRepository provides basic CRUD operations out of the box
}