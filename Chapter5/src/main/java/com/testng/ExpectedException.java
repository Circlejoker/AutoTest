package com.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 什么时候会用到异常测试？
     * 当我们期望结果为某一个异常的时候
     * 比如：传入一个参数不合法的时候，程序抛出异常
     * 即： 我的预期结果就是这个异常
     */

    //这是一个执行失败的异常测试
    @Test(expectedExceptions = RuntimeException.class )
    public void runTimeExceptionFail(){
        System.out.print("这是一个失败的异常测试");
    }

    //这是一个执行成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.print("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
