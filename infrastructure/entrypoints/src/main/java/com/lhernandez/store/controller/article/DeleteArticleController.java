package com.lhernandez.store.controller.article;

import com.lhernandez.store.dto.ArticleDto;
import com.lhernandez.store.handler.ArticleHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article")
public class DeleteArticleController {

    private final ArticleHandler handler;

    public DeleteArticleController(ArticleHandler handler) {
        this.handler = handler;
    }

    @Operation(summary = "Delete an article",description = "The endpoint deletes an article from the database",tags = {"DeleteArticleController"})
    @Parameter(name = "requestBody",description = "JSON to delete an article",
               content = @Content(
                       mediaType = "application/json",
                       examples = @ExampleObject(
                               name = "Article",
                               summary = "Json to delete an article",
                               value = """
                                        {
                                            id:2,
                                            title: 'Soap',
                                            description: 'Soap for toilet',
                                            price: 200.00
                                        }
                                       """
                       )
               )
    )
    @PostMapping("/delete")
    public ResponseEntity<ArticleDto> delete(@RequestBody ArticleDto articleDto){
        this.handler.deleteArticle(articleDto);
        return ResponseEntity.ok().build();
    }
}
