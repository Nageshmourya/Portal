package com.Nagesh.Create.a.Portal.repository;

import com.Nagesh.Create.a.Portal.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,String> {
}
