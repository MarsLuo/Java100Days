package com.marsluo.hello.hellospring;

import com.marsluo.hello.hellospring.controller.UserController;
import com.marsluo.hello.hellospring.model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTests {

    @Autowired
    private MockMvc mvc;

    @Before
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void testUserController() throws Exception {
        RequestBuilder requestBuilder;

        requestBuilder = get("/users/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string("[]"));

        requestBuilder = post("/users/")
                .param("id", "1")
                .param("age", "18")
                .param("name", "ZhangSan");
        mvc.perform(requestBuilder)
                .andExpect(content().string(equalTo("success")));

        requestBuilder = get("/users/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string("[{\"id\":1,\"name\":\"ZhangSan\",\"age\":18}]"));

        requestBuilder = put("/users/1")
                .param("age", "22")
                .param("name", "LiSi");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("success")));

        requestBuilder = get("/users/1");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string("{\"id\":1,\"name\":\"LiSi\",\"age\":22}"));

        requestBuilder = delete("/users/1");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string("{\"id\":1,\"name\":\"LiSi\",\"age\":22}"));

        requestBuilder = get("/users/");
        mvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().string("[]"));
    }
}
