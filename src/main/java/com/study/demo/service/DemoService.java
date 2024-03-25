package com.study.demo.service;

import com.study.demo.model.DemoModel;
import com.study.demo.repository.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import org.springframework.util.Assert;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;

//    private final DemoMapper demoMapper;
//
//    public DemoService(DemoMapper demoMapper) {
//        Assert.notNull(demoMapper, "MyCollaborator must not be null!");
//        this.demoMapper = demoMapper;
//    }

    public List<DemoModel> getDemoData() {
        return demoMapper.getDemoData();
    }
}
