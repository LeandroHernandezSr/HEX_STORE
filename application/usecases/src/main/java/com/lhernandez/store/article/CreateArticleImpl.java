package com.lhernandez.store.article;

import com.lhernandez.store.Article;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CreateArticleImpl implements CreateArticle{

    private final ArticleRepository repository;

    public CreateArticleImpl(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Article> createArticle(Article article) {
        return repository.createArticle(article);
    }
}
