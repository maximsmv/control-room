package com.itprom.jet.common.processor;

import com.itprom.jet.common.messeges.Message;

public interface MessageProcessor<T extends Message> {
    void process(String jsonMessage);

}
