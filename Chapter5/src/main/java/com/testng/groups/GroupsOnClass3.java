package com.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void techaer1(){
        System.out.println("这是GroupsOnClass3中运行的teacher111111方法");
    }
    public void techaer2(){
        System.out.println("这是GroupsOnClass3中运行的teacher222222方法");
    }
}
