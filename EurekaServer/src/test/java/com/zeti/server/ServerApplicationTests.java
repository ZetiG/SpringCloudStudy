package com.zeti.server;

import com.zeti.server.controller.TestMockMvc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

    @Test
    public void contextLoads() {
    }

    private MockMvc mvc;

    @Test
    public void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(new TestMockMvc()).build();
    }

    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/mock/test").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                ;
    }
}
