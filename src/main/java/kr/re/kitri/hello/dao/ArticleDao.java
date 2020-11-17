package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


// DB 바라기.. DB 밖에 난몰라
@Repository
public class ArticleDao {

    public List<Article> selectAllArticles() {
        // select * from article;
        // 결과셋을 옮겨 담아야된다.
        // List<Article>
        List<Article> articleList = List.of(
                new Article("1", "good day", "very good", "kim", 0),
                new Article("2", "good day3", "very good2", "lee", 20),
                new Article("3", "good day4", "very good3", "park", 15),
                new Article("4", "good day5", "very good4", "kwon", 3),
                new Article("5", "good day6", "very good5", "jang", 7)
        );
        return articleList;
    }

    public Article selectArticleById(String articleId) {
        // select * from article where article_id=:articleId
        // 글 1개가 조회됨
        // Article 객체로 만들어 반환
        return new Article("3", "good", "매우좋아요..", "김순곤", 10);
    }

    public Article insertArticle(Article article) {
        String articleId = article.getArticleId();
        String title = article.getTitle();
        // insert into article values (articleId, title, ...)
        return article;
    }
}
