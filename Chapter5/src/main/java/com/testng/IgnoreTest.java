package com.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignoreTest(){
        System.out.print("忽略测试代码执行");
    }

    @Test(enabled = false)   //在Test标签旁加一个(enabled = false)就不会执行对应方法代码
    public void ignoreTest2(){
        System.out.print("忽略测试代码2执行");
    }

    @Test(enabled = true)    //在Test标签旁加一个(enabled = true)就会执行对应方法代码,enabled默认是true
    public void ignoreTest3(){
        System.out.print("忽略测试代码3执行");
    }

    @Test(enabled=true)
    public void ignoreTest4(){
        System.out.print("忽略测试代码4执行");
    }

}
