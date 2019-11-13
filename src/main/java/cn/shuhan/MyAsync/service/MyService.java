package cn.shuhan.MyAsync.service;

import org.springframework.scheduling.annotation.Async;

public interface MyService {

//    @Async
    void useAsync();

    @Async
    void useAsync1();

    @Async
    void useAsync2();
}
