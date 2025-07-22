package com.lhernandez.store.article;

import com.lhernandez.store.Article;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GetArticleImpl implements GetArticle {

    private final ArticleRepository repository;

    public GetArticleImpl(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Article> getArticle(Integer id) {
        return repository.getArticleById(id);
    }
}
