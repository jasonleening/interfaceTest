package com.example.testdemo.multithread;

public class TestInterface {

    TestInnerClass testInnerClass;
    public void testInterface(TestInnerClass testInnerClass){
        this.testInnerClass = testInnerClass;

        testInnerClass.cry();

        testInnerClass.laugh();


        testInnerClass.speak();

    }
}
