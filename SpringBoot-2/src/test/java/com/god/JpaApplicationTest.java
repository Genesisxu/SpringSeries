package com.god;

import com.god.entity.User;
import com.god.service.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Gensis on 2016/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JpaApplicationTest {

    @Autowired
    private  UserRepository userRepository;
    @Test
    public void test() {
        userRepository.save(new User("god", 10));
    }
}
