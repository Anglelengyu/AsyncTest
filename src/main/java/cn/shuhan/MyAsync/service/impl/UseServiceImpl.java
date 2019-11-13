package cn.shuhan.MyAsync.service.impl;

import cn.shuhan.MyAsync.service.MyService;
import cn.shuhan.MyAsync.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseServiceImpl implements UseService {

    @Autowired
    MyService service;

    public void useAsyncTest(){
        System.out.println("执行方法前**********");
        service.useAsync1();
        service.useAsync2();
        System.out.println("执行方法后**********");
    }
}
