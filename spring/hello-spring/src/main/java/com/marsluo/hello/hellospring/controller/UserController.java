package com.marsluo.hello.hellospring.controller;

import com.marsluo.hello.hellospring.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        return new ArrayList<>(users.values());
    }

    //get
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return  users.get(id);
    }

    //post
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return "success";
    }
    //put
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute User user) {
        User beforeUser = users.get(id);
        beforeUser.setId(user.getId());
        beforeUser.setAge(user.getAge());
        beforeUser.setName(user.getName());
        return "success";
    }
    //delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public User delUser(@PathVariable Long id) {
        return  users.remove(id);
    }
}
