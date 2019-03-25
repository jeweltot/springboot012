package me.jeweltot.springboot012.mapper.sample;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SampleMapper
{
    String getNow();
}
