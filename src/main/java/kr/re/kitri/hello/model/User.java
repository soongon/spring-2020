package kr.re.kitri.hello.model;

public class User {
    // userId, name, point, email
    private String userId;
    private String name;
    private int point;
    private String email;

    // 생성자 2개 (파라미터 없는 생성자, 모든 속성을 파라미터로 하는 생성자)
    public User() {}

    public User(String userId, String name, int point, String email) {
        this.userId = userId;
        this.name = name;
        this.point = point;
        this.email = email;
    }
    // setter, getter
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", point=" + point +
                ", email='" + email + '\'' +
                '}';
    }
}
