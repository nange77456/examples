package com.example.patternlib;

import java.util.HashMap;
import java.util.Map;

public class Bus {
    private static Map<String,Receiver> receiverMap = new HashMap<>();

    public static interface Receiver{
        void onReceive(String msg);
    }

    public static void send(String toId,String msg){
        if(receiverMap.containsKey(toId)){
            Receiver receiver = receiverMap.get(toId);
            receiver.onReceive(msg);
        }
    }

    public static void register(String id, Receiver receiver){
        receiverMap.put(id,receiver);
    }

    public static void unRegister(String id){
        receiverMap.remove(id);
    }
}