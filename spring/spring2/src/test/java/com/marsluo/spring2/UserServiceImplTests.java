package com.marsluo.spring2;

import com.marsluo.spring2.model.User;
import com.marsluo.spring2.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserServiceImplTests {

    @Autowired
    private UserService userService;

    @BeforeEach
    public void setUp() {
        // 准备，清空user表
        userService.deleteAllUsers();
    }

    @Test
    public void test() {
        // 插入5个用户
        userService.create("Tom", 10);
        userService.create("Mike", 11);
        userService.create("Didispace", 30);
        userService.create("Oscar", 21);
        userService.create("Linda", 17);

        // 查询名为Oscar的用户，判断年龄是否匹配
        List<User> userList = userService.getByName("Oscar");
        assertThat(userList.get(0).getAge()).isEqualTo(21);

        // 查数据库，应该有5个用户
        assertThat(userService.getAllUsers().size()).isEqualTo(5);

        // 删除两个用户
        userService.deleteByName("Tom");
        userService.deleteByName("Mike");

        // 查数据库，应该有3个用户
        assertThat(userService.getAllUsers().size()).isEqualTo(3);
    }
}