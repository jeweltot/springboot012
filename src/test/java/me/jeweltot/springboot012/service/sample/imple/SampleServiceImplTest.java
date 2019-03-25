package me.jeweltot.springboot012.service.sample.imple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SampleServiceImplTest
{
    @Autowired
    SampleServiceImpl sampleService;

    @Test
    public void getNowTest() {
        String now = sampleService.getNow();
        System.out.println(now);
    }
}