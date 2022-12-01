package com.example.humanresources;

import com.example.humanresources.entity.User;
import com.example.humanresources.services.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = HumanResourcesApplication.class)
@RunWith(SpringRunner.class)
@RequiredArgsConstructor
public class ReflectionUtilTest {
    @Autowired
    UserService userService;

    @Test
    public void reflectionCreateMethodeTest() throws Exception {
        User user = new User();
        userService.create(user);

    }

}
