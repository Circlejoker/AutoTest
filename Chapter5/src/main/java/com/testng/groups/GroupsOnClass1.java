package com.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void student1(){
        System.out.println("这是GroupsOnClass1中运行的stu111111方法");
    }
    public void student2(){
        System.out.println("这是GroupsOnClass1中运行的stu222222方法");
    }
}
