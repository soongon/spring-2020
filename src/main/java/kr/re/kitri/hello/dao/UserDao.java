package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    public User insertUser(User user) {
        // TODO DB에 연동하여 데이터를 가져와서
        // User 객체에 담아서 전달해준다.
        // insert 수행 후...

        return user;
    }
}
