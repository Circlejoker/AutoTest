package com.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void student3(){
        System.out.println("这是GroupOnClass2中运行的student3方法");
    }
    public void student4(){
        System.out.println("这是GroupOnClass2中运行的student4方法");
    }
}
