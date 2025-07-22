package com.lhernandez.store.article;

import com.lhernandez.store.Article;

import java.util.Optional;

public interface GetArticle {
    Optional<Article>getArticle(Integer id);
}
