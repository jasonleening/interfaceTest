package com.example.interfacetest;

/**
 * 模拟消息发送类
 */
public class MsgSender {

    public void startMsgSender(IEventCallback callback){

        //发送消息回调
        callback.onSendMsg();

        //接收到消息
        callback.onReadMsg();

        //发生错误
        callback.onError();

        //通道关闭
        callback.onClose();
    }

}
