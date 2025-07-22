package com.lhernandez.store.article;

import com.lhernandez.store.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {
    Optional<Article> createArticle(Article article);
    void deleteArticle(Article article);
    List<Article> getAllArticles();
    Optional<Article>getArticleById(Integer id);
    Optional<Article>updateArticle(Article article);
}
