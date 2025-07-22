package com.lhernandez.store.article;

import com.lhernandez.store.Article;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllArticlesImpl implements GetAllArticles{

    private final ArticleRepository repository;

    public GetAllArticlesImpl(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Article> getAllArticles() {
        return repository.getAllArticles();
    }
}
