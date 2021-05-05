package com.testng;

/*
  超时测试
  在@Test注解里加一个timeOut的属性，对应的加上时间xxx毫秒
 */

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)//单位为毫秒，3000毫秒即3s  ，这个方法是可以运行通过的，因为未超时
    public void test() throws InterruptedException {
        Thread.sleep(2000);  //单位为毫秒，2000毫秒即2s
    }

    @Test(timeOut = 2000) //执行这个方法是会抛出异常的
    public void test1() throws InterruptedException {
        Thread.sleep(3000);
    }
}
