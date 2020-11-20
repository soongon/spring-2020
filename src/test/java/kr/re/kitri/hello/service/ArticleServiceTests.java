package kr.re.kitri.hello.service;

import kr.re.kitri.hello.model.Article;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArticleServiceTests {

    @Autowired
    private ArticleService articleService;

    public void testGetAllArticles() {
    }

    @Test
    public void testGetDetailByArticleId() {
        Article result = articleService.getDetailByArticleId("4");
        // Assertions.assertNotNull(result);
        // Assertions.assertNotNull(result.getArticleId());
        // Assertions.assertEquals(result.getArticleId(), "4");
        Assertions.assertTrue(result.getArticleId().equals("4"));
    }

    public void testAddArticle() { }

}
