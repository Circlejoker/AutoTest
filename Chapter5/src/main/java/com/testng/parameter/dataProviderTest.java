package com.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class dataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.print("name:"+name+";"+"age:"+age);
    }
    @DataProvider(name ="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",15},
                {"wangwu",20},
                {"zhaoliu",25}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.print("test1方法 name="+name+";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.print("test2方法 name="+name+";age="+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result =null;
        if(method.getName().equals("test1")){
            result= new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;

    }

}
