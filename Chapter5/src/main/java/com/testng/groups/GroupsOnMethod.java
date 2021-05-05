package com.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {


    @Test(groups = "server")
    public void serverTest1(){
        System.out.println("这是服务端端运行的测试组1111111111");
    }
    @Test(groups = "server")
    public void serverTest2(){
        System.out.println("这是服务端端运行的测试组222222222222");
    }
    @Test(groups = "client")
    public void clientTest1(){
        System.out.println("这是客户端运行的测试组11");
    }
    @Test(groups = "client")
    public void clientTest2(){
        System.out.println("这是客户端运行的测试组222222");
    }
    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端运行前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端运行后运行的方法");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端运行前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端运行后运行的方法");
    }


}
