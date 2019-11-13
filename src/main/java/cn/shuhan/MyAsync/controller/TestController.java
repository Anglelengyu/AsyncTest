package cn.shuhan.MyAsync.controller;

import cn.shuhan.MyAsync.service.MyService;
import cn.shuhan.MyAsync.service.MyAsyncServiceImpl;
import cn.shuhan.MyAsync.service.impl.UseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final MyAsyncServiceImpl myAsyncServiceImpl;
    private final MyService myAsyncService;
    private final UseServiceImpl useService;

    @Autowired
    public TestController(final MyAsyncServiceImpl myAsyncServiceImpl,
                          final MyService myAsyncService,
                          final UseServiceImpl useService) {
        this.myAsyncServiceImpl = myAsyncServiceImpl;
        this.myAsyncService = myAsyncService;
        this.useService = useService;
    }

    /**
     * 直接标记到impl层 ，正常异步
     */
    @RequestMapping("/")
    public void test() {
        System.out.println("hello world");
        myAsyncServiceImpl.useAsync1();
        myAsyncServiceImpl.useAsync2();
        System.out.println("end world");
    }

    /**
     * service 层注入必须是要注入的对象才能使用异步
     */
    @RequestMapping("/test")
    public void test1() {
        System.out.println("hello world");
        myAsyncService.useAsync1();
        myAsyncService.useAsync2();
        System.out.println("end world");
    }

    /**
     * 在impl层调用当前接口的实现的Async不能起作用
     */
    @RequestMapping("/test2")
    public void test2() {
        System.out.println("hello world");
        myAsyncService.useAsync();
//        myAsyncService.useAsync2();
        System.out.println("end world");
    }

    /**
     * 要使用要先拿到代理或者注入的对象才有异步功能
     */
    @RequestMapping("/test3")
    public void test3() {
        System.out.println("hello world");
        useService.useAsyncTest();
        System.out.println("end world");
    }
}
