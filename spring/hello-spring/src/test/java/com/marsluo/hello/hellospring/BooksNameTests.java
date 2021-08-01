package com.marsluo.hello.hellospring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import com.marsluo.hello.hellospring.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
public class BooksNameTests {

    @Autowired
    private Book book;

    @Test
    void testCreateBook() {
        assertThat(book.getAuthor()).isEqualTo("MarsLuo");
        assertThat(book.getName()).isEqualTo("SpringCloudInAction");
    }
}
