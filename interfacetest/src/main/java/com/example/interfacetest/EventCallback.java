package com.example.interfacetest;

public abstract class EventCallback implements IEventCallback {
    @Override
    public abstract void onReadMsg();//要求必须重写，非常关键

    @Override
    public void onClose() {
        //空方法体，子类如果关心可以重写
    }

    @Override
    public void onError() {
        //空方法体，子类如果关心可以重写
    }

    @Override
    public void onSendMsg() {
        //空方法体，子类如果关心可以重写
    }
}


//public abstract class EventCallback {
//
//    public abstract void onReadMsg() ;//要求必须重写，非常关键
//
//    public void onClose() {
//        //空方法体，子类如果关心可以重写
//    }
//
//    public void onError() {
//        //空方法体，子类如果关心可以重写
//    }
//
//    public void onSendMsg() {
//        //空方法体，子类如果关心可以重写
//    }
//}

