package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.UserDao;
import kr.re.kitri.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// 기능을 수행하는 핵심, 트랜잭션..
@Service
public class UserService {

    @Autowired private UserDao userDao;

    // 회원가입
    public User registerUser(User user) {
        return userDao.insertUser(user);
    }

    // 회원 전체보기
    public List<User> getAllUsers() {
        return null;
    }

    // 회원 상세보기
    public User getUserByUserId(String userId) {
        return null;
    }
}
