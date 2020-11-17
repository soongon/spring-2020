package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.ArticleDao;
import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    // 글 전체보기
    public List<Article> getAllArticles() {
        return articleDao.selectAllArticles();
    }

    // 글상세보기
    public Article getDetailByArticleId(String articleId) {
        return articleDao.selectArticleById(articleId);
    }

    public Article addArticle(Article article) {
        return articleDao.insertArticle(article);
    }
}
