package com.flaudio.spring_boot_poc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith( SpringRunner.class )
@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerITest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetHello() throws Exception {

        ResultActions result = mockMvc.perform(get("/"));

        result  .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Holis mundo!!!")));
    }
}
