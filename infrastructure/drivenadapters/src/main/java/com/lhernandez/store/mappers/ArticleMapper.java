package com.lhernandez.store.mappers;

import com.lhernandez.store.Article;
import com.lhernandez.store.entities.ArticleEntity;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {


    public Article entityToArticle(ArticleEntity articleEntity) {
        return new Article(articleEntity.getId(),
                articleEntity.getTitle(),
                articleEntity.getDescription(),
                articleEntity.getPrice());
    }

    public ArticleEntity articleToEntity(Article article) {
        return new ArticleEntity(article.getId(),
                article.getTitle(),
                article.getDescription(),
                article.getPrice());
    }
}
