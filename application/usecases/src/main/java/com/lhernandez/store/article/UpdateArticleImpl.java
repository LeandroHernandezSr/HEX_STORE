package com.lhernandez.store.article;

import com.lhernandez.store.Article;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UpdateArticleImpl implements  UpdateArticle {

    private final ArticleRepository repository;

    public UpdateArticleImpl(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Article> updateArticle(Article article) {
        return repository.updateArticle(article);
    }
}
