package cn.shuhan.MyAsync.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyAsyncServiceImpl {

    @Async
    public void useAsync1(){
        System.out.println("**********进入方法1*********");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**********方法1执行完毕*********");
    }

    @Async
    public void useAsync2(){
        System.out.println("**********进入方法2*********");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("**********方法2执行完毕*********");
    }
}
