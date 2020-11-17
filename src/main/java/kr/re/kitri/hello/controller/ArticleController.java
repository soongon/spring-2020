package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    // 프론트엔드에서 작성된(생성된) 데이터를 확보..
    @PostMapping("/articles")
    public Article writeArticle(@RequestBody Article article) {
        return articleService.addArticle(article);
    }

    @GetMapping("/articles")
    public List<Article> viewAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/articles/{articleId}")
    public Article viewDetailByArticleId(@PathVariable String articleId) {
        // System.out.println(userId);
        return articleService.getDetailByArticleId(articleId);
    }

    // http://cafe.daum.net/Cairns/GNJJ/138
}
