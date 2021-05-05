package com.testng;

import org.testng.annotations.Test;

public class DependTest {

    //这里test1做了一个异常测试，但是是可以执行的
    @Test(expectedExceptions = RuntimeException.class)
    public void test1(){
        System.out.print("test1 Run");
        throw new RuntimeException();
    }

    //这里test2做了一个以来测试，依赖先执行test1再执行test2方法，类似于用例里的先执行前置条件
    //而在test1中加了一个异常测试就是为了做判断，如果test1都无法执行成功，就没有必要去执行test2方法里的代码了
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.print("test2 Run");
    }
}
