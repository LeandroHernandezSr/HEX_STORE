package com.lhernandez.store.controller.article;

import com.lhernandez.store.dto.ArticleDto;
import com.lhernandez.store.handler.ArticleHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/article")
public class GetAllArticlesController {

    private final ArticleHandler handler;

    public GetAllArticlesController(ArticleHandler handler) {
        this.handler = handler;
    }

    @PostMapping("/get-all")
    public ResponseEntity<List<ArticleDto>> getAllArticles() {
        List<ArticleDto> articleDtoList = this.handler.getAllArticles();
        return new ResponseEntity<>(articleDtoList, HttpStatus.OK);
    }
}
