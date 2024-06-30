package com.example.graphql.resolver;

import com.example.graphql.model.Book;
import com.example.graphql.repository.BookRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookResolver implements GraphQLQueryResolver {

    private final BookRepository bookRepository;


    public BookResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> allBooks() {  // 변경된 메서드
        return bookRepository.findAllBooksWithAuthors();
    }

    public Book bookById(Long id) {  // 변경된 메서드
        return bookRepository.findBookWithAuthorById(id).orElse(null);
    }


}
