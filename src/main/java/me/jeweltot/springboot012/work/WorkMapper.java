package me.jeweltot.springboot012.work;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WorkMapper
{
    String getNow();
}
