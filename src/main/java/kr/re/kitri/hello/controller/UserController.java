package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.User;
import kr.re.kitri.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 회원가입
    @PostMapping("/users")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
    // 회원 전체 조회
    @GetMapping("/users")
    public List<User> viewAllUsers() {
        return null;
    }
    // 회원 상세 조회
    @GetMapping("/users/{userId}")
    public User viewUserByUserId(@PathVariable String userId) {
        return null;
    }
}
