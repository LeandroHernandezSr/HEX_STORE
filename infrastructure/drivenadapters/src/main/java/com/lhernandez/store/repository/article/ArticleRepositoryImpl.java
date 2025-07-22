package com.lhernandez.store.repository.article;

import com.lhernandez.store.Article;
import com.lhernandez.store.article.ArticleRepository;
import com.lhernandez.store.mappers.ArticleMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository {

    private final ArticleJpaRepository repository;
    private final ArticleMapper mapper;

    public ArticleRepositoryImpl(ArticleJpaRepository articleJpaRepository, ArticleMapper mapper) {
        this.repository = articleJpaRepository;
        this.mapper = mapper;
    }

    @Override
    public Optional<Article> createArticle(Article article) {
        return Optional.of(mapper.entityToArticle(repository.save(mapper.articleToEntity(article))));
    }

    @Override
    public void deleteArticle(Article article) {
        repository.delete(mapper.articleToEntity(article));
    }

    @Override
    public List<Article> getAllArticles() {
        return repository.findAll().stream()
                .map(mapper::entityToArticle)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Article> getArticleById(Integer id) {
        return Optional.of(mapper.entityToArticle(repository.getReferenceById(id)));
    }

    @Override
    public Optional<Article> updateArticle(Article article) {
        return Optional.of(mapper.entityToArticle(repository.save(mapper.articleToEntity(article))));
    }
}
