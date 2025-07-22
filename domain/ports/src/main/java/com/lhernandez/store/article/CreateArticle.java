package com.lhernandez.store.article;

import com.lhernandez.store.Article;

import java.util.Optional;

public interface CreateArticle {
    Optional<Article> createArticle(Article article);
}
