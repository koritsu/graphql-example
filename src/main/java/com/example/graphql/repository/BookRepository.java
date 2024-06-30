
package com.example.graphql.repository;

import com.example.graphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b JOIN FETCH b.author WHERE b.id = :id")
    Optional<Book> findBookWithAuthorById(@Param("id") Long id);

    @Query("SELECT b FROM Book b JOIN FETCH b.author")
    List<Book> findAllBooksWithAuthors();

}
