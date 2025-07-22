package com.lhernandez.store.controller.article;

import com.lhernandez.store.dto.ArticleDto;
import com.lhernandez.store.handler.ArticleHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class UpdateArticleController {

    private final ArticleHandler handler;

    public UpdateArticleController(ArticleHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/update")
    public ResponseEntity<ArticleDto> update(@RequestBody ArticleDto articleDto) {
        return new ResponseEntity<>(this.handler.updateArticle(articleDto).get(), HttpStatus.OK);
    }
}
