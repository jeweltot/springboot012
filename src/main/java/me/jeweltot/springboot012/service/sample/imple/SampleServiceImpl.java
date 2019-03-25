package me.jeweltot.springboot012.service.sample.imple;

import me.jeweltot.springboot012.mapper.sample.SampleMapper;
import me.jeweltot.springboot012.service.sample.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService
{
    @Autowired
    SampleMapper sampleMapper;

    @Override
    public String getNow()
    {
        return sampleMapper.getNow();
    }
}
