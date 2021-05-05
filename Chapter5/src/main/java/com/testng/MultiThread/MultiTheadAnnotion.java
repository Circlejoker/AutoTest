package com.testng.MultiThread;

import org.testng.annotations.Test;

public class MultiTheadAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.print(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
