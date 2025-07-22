package com.lhernandez.store.controller.article;

import com.lhernandez.store.dto.ArticleDto;
import com.lhernandez.store.handler.ArticleHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class GetArticleController {

    private final ArticleHandler handler;

    public GetArticleController(ArticleHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/get-article/{id}")
    public ResponseEntity<ArticleDto> getArticle(@PathVariable Integer id) {
        return new ResponseEntity<>(handler.getArticleById(id).get(), HttpStatus.OK);
    }
}
