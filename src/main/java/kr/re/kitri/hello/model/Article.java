package kr.re.kitri.hello.model;

public class Article {
    private String articleId;
    private String title;
    private String content;
    private String author;
    private long likes;

    public Article() {}

    public Article(String articleId, String title, String content, String author, long likes) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.likes = likes;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", likes=" + likes +
                '}';
    }
}
