package com.test_sp.test;

//Proxy pattern

public class MessageProxy {
    private Message realMessage;

    public MessageProxy(Message realMessage) {
        this.realMessage = realMessage;
    }

    public void accept(MessageVisitor visitor) {
        realMessage.accept(visitor);
    }
}
