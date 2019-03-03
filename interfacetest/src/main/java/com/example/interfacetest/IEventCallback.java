package com.example.interfacetest;

public interface IEventCallback {
    //消息收到
    void onReadMsg();
    //消息发送
    void onSendMsg();
    //异常错误
    void onError();
    //通道关闭
    void onClose();
}
