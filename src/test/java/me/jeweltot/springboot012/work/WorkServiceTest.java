package me.jeweltot.springboot012.work;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class WorkServiceTest
{
    @Autowired
    WorkService workService;

    @Test
    public void getNowTest() {
        String now = workService.getNow();
        System.out.println(now);
    }
}