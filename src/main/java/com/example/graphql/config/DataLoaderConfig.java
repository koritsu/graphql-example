
package com.example.graphql.config;

import com.example.graphql.model.Author;
import com.example.graphql.repository.AuthorRepository;
import org.dataloader.BatchLoader;
import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.CompletableFuture;

@Configuration
public class DataLoaderConfig {

    private final AuthorRepository authorRepository;

    public DataLoaderConfig(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Bean
    public DataLoaderRegistry dataLoaderRegistry() {
        DataLoaderRegistry registry = new DataLoaderRegistry();
        registry.register("authorLoader", createAuthorLoader());
        return registry;
    }

    private DataLoader<Long, Author> createAuthorLoader() {
        BatchLoader<Long, Author> batchLoader = ids -> CompletableFuture.supplyAsync(() -> authorRepository.findAllById(ids));
        return DataLoader.newDataLoader(batchLoader);
    }
}
