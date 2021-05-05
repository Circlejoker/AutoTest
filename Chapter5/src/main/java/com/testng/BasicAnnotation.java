package com.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法
    @Test
    public void testCase1(){
        System.out.print("这是测试用例1");
        System.out.printf("Thread ID: %s %n",Thread.currentThread().getId());
    }

    @BeforeClass   //在类之前运行的标签
    public void beforeClass(){
        System.out.print("这是类在运行之前运行的方法");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.print("这是在测试方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.print("这是在测试方法之后运行的");
    }

    @Test
    public void testCase2(){
        System.out.print("这是测试用例2");
        System.out.printf("Thread ID: %s %n",Thread.currentThread().getId());
    }

    @AfterClass
    public void afterClass(){
        System.out.print("这是类在运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.print("测试套件执行前运行");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.print("测试套件执行后运行");
    }



}
