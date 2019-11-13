package cn.shuhan.MyAsync.service.impl;

import cn.shuhan.MyAsync.service.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public void useAsync() {
        useAsync1();
        useAsync2();
    }


    @Override
    public void useAsync1() {
        System.out.println("**********进入方法1*********");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**********方法1执行完毕*********");
    }


    @Override
    public void useAsync2() {
        System.out.println("**********进入方法2*********");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**********方法2执行完毕*********");
    }
}
