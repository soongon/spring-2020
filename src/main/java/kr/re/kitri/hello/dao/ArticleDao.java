package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


// DB 바라기.. DB 밖에 난몰라
@Repository
@Mapper
public interface ArticleDao {

    List<Article> selectAllArticles();
    Article selectArticleById(String articleId);
    void insertArticle(Article article);
}
