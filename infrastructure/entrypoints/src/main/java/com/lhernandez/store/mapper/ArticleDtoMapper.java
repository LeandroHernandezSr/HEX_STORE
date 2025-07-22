package com.lhernandez.store.mapper;

import com.lhernandez.store.Article;
import com.lhernandez.store.dto.ArticleDto;
import org.springframework.stereotype.Component;

@Component
public class ArticleDtoMapper {

    public ArticleDto toDto(Article article) {
        return new  ArticleDto(
                article.getId(),
                article.getTitle(),
                article.getDescription(),
                article.getPrice()
        );
    }

    public Article toEntity(ArticleDto articleDto) {
        return new Article(
                articleDto.getId(),
                articleDto.getTitle(),
                articleDto.getDescription(),
                articleDto.getPrice()
        );
    }
}
