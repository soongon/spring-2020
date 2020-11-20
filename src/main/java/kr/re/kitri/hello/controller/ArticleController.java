package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {
    public static Logger log =
            LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    private ArticleService articleService;

    // 프론트엔드에서 작성된(생성된) 데이터를 확보..
    @PostMapping("/articles")
    public Article writeArticle(@RequestBody Article article) {

        log.debug(article.toString());
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
