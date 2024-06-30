package com.example.graphql.resolver;

import com.example.graphql.model.Author;
import com.example.graphql.model.Book;
import com.example.graphql.repository.AuthorRepository;
import com.example.graphql.repository.BookRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMutationResolver implements GraphQLMutationResolver {

    private final BookRepository bookRepository;

    private final AuthorRepository authorRepository;

    public Book addBook(String title, Long authorId) {
        Author author = authorRepository.findById(authorId).orElseThrow(() -> new RuntimeException("Author not found"));
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        return bookRepository.save(book);
    }

}
