package com.lhernandez.store.controller.article;

import com.lhernandez.store.dto.ArticleDto;
import com.lhernandez.store.handler.ArticleHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class CreateArticleController {

    private final ArticleHandler handler;

    public CreateArticleController(ArticleHandler handler) {
        this.handler = handler;
    }

    @Operation(summary = "Create an new article",description = "Endpoint to create an article",tags = {"CreateArticleController"})
    @Parameter(name = "requestBody",description = "JSON input for article data",
            content = @Content(
                mediaType = "application/json",
                examples = @ExampleObject(
                    name = "Article example",
                    summary = "Example article input",
                    value = """
                            {
                                id:null,
                                title: 'Soap',
                                description: 'Soap for toilet',
                                price: 200.00
                            }
                            """
                )
            )
    )
    @ApiResponse(responseCode = "200",description = "Article was created successfully")
    @PostMapping("/create")
    public ResponseEntity<ArticleDto> createArticle(@RequestBody ArticleDto articleDto) {
        return new ResponseEntity<>(handler.createArticle(articleDto).get(), HttpStatus.CREATED);
    }
}
