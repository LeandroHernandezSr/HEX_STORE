package com.lhernandez.store.handler;

import com.lhernandez.store.article.*;
import com.lhernandez.store.dto.ArticleDto;
import com.lhernandez.store.mapper.ArticleDtoMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ArticleHandler {

    private final ArticleDtoMapper mapper;
    private final CreateArticle createArticle;
    private final GetArticle getArticle;
    private final DeleteArticle deleteArticle;
    private final GetAllArticles getAllArticles;
    private final UpdateArticle updateArticle;

    public ArticleHandler(ArticleDtoMapper mapper, CreateArticle createArticle, GetArticle getArticle, DeleteArticle deleteArticle, GetAllArticles getAllArticles, UpdateArticle updateArticle) {
        this.mapper = mapper;
        this.createArticle = createArticle;
        this.getArticle = getArticle;
        this.deleteArticle = deleteArticle;
        this.getAllArticles = getAllArticles;
        this.updateArticle = updateArticle;
    }

    public Optional<ArticleDto> getArticleById(Integer id) {
        return getArticle.getArticle(id).map(mapper::toDto);
    }

    public Optional<ArticleDto> createArticle(ArticleDto articleDto) {
        return createArticle.createArticle(mapper.toEntity(articleDto)).map(mapper::toDto);
    }

    public void deleteArticle(ArticleDto articleDto) {
        deleteArticle.deleteArticle(mapper.toEntity(articleDto));
    }

    public List<ArticleDto> getAllArticles() {
        return getAllArticles.getAllArticles().stream().map(mapper::toDto).toList();
    }

    public Optional<ArticleDto> updateArticle(ArticleDto articleDto) {
        return updateArticle.updateArticle(mapper.toEntity(articleDto)).map(mapper::toDto);
    }
}
