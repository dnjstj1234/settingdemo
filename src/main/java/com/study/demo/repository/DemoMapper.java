package com.study.demo.repository;

import com.study.demo.model.DemoModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {
    List<DemoModel> getDemoData();
}
