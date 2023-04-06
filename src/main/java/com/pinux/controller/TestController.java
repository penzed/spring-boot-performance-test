package com.pinux.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pinux
 * @Description TODO
 * @date 2023/04/06 17:26
 **/
@RestController
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "/demo")
    public void demo() {
        System.out.println("访问成功");
    }

    /**
     * 模拟CPU占满
     */
    @RequestMapping("/cpu/loop")
    public void testCPULoop() throws InterruptedException {
        System.out.println("请求cpu死循环");
        Thread.currentThread().setName("loop-thread-cpu");
        int num = 0;
        while (true) {
            num++;
            if (num == Integer.MAX_VALUE) {
                System.out.println("reset");
            }
            num = 0;
        }
    }
}