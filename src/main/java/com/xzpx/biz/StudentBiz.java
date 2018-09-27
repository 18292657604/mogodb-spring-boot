package com.xzpx.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by angel on 2018/9/27.
 */
@Service
public class StudentBiz {

    @Autowired
    private StudentBiz studentBiz;


    public int saveStudent(){
        return 1;
    }



}
