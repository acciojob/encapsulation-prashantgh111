package com.driver;

public class Main {

    public static void main(String [] args){
        RWOnly p = new RWOnly();
//        p.name="prashant";
//        System.out.println(p);   // name has private access in com.driver.RWOnly
        p.setName("prashant");
        p.getName();     // only we have to call it no need to print anything.

    }
}