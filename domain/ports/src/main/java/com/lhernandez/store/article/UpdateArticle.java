package com.lhernandez.store.article;

import com.lhernandez.store.Article;

import java.util.Optional;

public interface UpdateArticle {
    Optional<Article> updateArticle(Article article);
}
