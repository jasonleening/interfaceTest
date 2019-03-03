package com.example.interfacetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements IEventCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MsgSender().startMsgSender(this);//直接传递接口实现者MainActivity

        new MsgSender().startMsgSender(new EventCallback() {//也可以传递接口实现者，抽象类EventCallback
            @Override
            public void onReadMsg() {
                //此方法比较关心，希望必须实现
            }

            @Override
            public void onClose() {
                super.onClose();
                //有点关心，重写下父类的方法
            }
        });
    }


    @Override
    public void onReadMsg() {

    }

    @Override
    public void onSendMsg() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void onClose() {

    }
}
