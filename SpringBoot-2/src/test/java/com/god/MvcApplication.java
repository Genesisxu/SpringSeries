package com.god;

import com.god.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Gensis on 2016/9/8.
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
//@ComponentScan("com.god")
@SpringBootTest(classes= MvcApplication.class)
public class MvcApplication {
    private MockMvc mockMvc;
    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }
    @Test
    public void contextLoads() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
