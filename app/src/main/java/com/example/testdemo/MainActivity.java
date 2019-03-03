package com.example.testdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testdemo.multithread.TestInnerClassA;
import com.example.testdemo.multithread.TestInterface;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new TestInterface().testInterface(testInnerClassA);

    }

    TestInnerClassA testInnerClassA =new TestInnerClassA(){


        @Override
        public void laugh() {
            System.out.println("laugh");

        }

        @Override
        public void speak() {
            System.out.println("speak");

        }

    };

}
