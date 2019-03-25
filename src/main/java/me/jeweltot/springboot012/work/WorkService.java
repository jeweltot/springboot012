package me.jeweltot.springboot012.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkService
{
    @Autowired
    WorkMapper workMapper;

    public String getNow() {
        return workMapper.getNow();
    }
}
