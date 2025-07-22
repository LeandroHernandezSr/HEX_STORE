package com.lhernandez.store.article;

import com.lhernandez.store.Article;
import org.springframework.stereotype.Component;

@Component
public class DeleteArticleImpl implements DeleteArticle{

    private final ArticleRepository repository;

    public DeleteArticleImpl(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public void deleteArticle(Article article) {
        this.repository.deleteArticle(article);
    }
}
