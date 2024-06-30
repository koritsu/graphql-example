package com.example.graphql.resolver;

import com.example.graphql.model.Author;
import com.example.graphql.repository.AuthorRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthorMutationResolver implements GraphQLMutationResolver {

    private final AuthorRepository authorRepository;

    public Author addAuthor(String name) {
        Author author = new Author();
        author.setName(name);
        return authorRepository.save(author);
    }

}
