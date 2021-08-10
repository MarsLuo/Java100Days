package com.marsluo.spring2.service;

import com.marsluo.spring2.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    UserServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(String name, Integer age) {
        return jdbcTemplate.update("INSERT INTO User(NAME, AGE) values (?,?)", name, age);
    }

    @Override
    public List<User> getByName(String name) {
        return jdbcTemplate.query("SELECT NAME, AGE FROM User WHERE NAME = ?", (resultSet, i) ->{
            User user = new User();
            user.setName(resultSet.getString("NAME"));
            user.setAge(resultSet.getInt("AGE"));
            return  user;
        }, name);
    }

    @Override
    public List<User> getAllUsers() {
        return jdbcTemplate.query("SELECT * FROM User", (resultSet, i) ->{
            User user = new User();
            user.setName(resultSet.getString("NAME"));
            user.setName(resultSet.getString("AGE"));
            return  user;
        });

    }

    @Override
    public int deleteByName(String name) {
        return jdbcTemplate.update("DELETE FROM User WHERE NAME = ?", name);
    }

    @Override
    public int deleteAllUsers() {
        return jdbcTemplate.update("DELETE FROM User");
    }
}
