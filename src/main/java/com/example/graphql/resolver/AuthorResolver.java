package com.example.graphql.resolver;

import com.example.graphql.model.Author;
import com.example.graphql.repository.AuthorRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorResolver implements GraphQLQueryResolver {

    private final AuthorRepository authorRepository;

    public AuthorResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> allAuthors() {
        return authorRepository.findAll();
    }
}
