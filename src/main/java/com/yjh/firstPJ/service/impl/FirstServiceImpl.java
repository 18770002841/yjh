package com.yjh.firstPJ.service.impl;

import com.yjh.firstPJ.dao.FirstDao;
import com.yjh.firstPJ.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {

    @Autowired
    FirstDao firstDao;

    public void getData(int data) {
        firstDao.getData(data);
    }
}
