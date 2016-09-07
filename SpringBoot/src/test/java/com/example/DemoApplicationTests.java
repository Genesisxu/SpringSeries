package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class DemoApplicationTests {
    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }


    @Test
    public void contextLoads() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        System.out.println("+++++++++++++++++++++++++++++");
    }

    @Autowired
    ApplicationProperties applicationProperties;

    @Test
    public void testApplicationProperties() {
        System.out.println("====================" + applicationProperties.getTest1() + "===================");
    }

    @Autowired
    ApplicationPropertiesWithConfigurationProperties applicationPropertiesWithConfigurationProperties;

    @Test
    public void test() {
        System.out.println("======================" + applicationPropertiesWithConfigurationProperties.getTest1() + "=============");
    }
}
