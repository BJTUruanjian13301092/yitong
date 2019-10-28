package com.example.yitong.entity;

public class DirectionNode{

    private ProtocolNode[] protocolNodes;

    public DirectionNode(){
        protocolNodes = new ProtocolNode[2];
    }

    public ProtocolNode add(String protocol){
        if(protocol.equals("tcp")){
            if(protocolNodes[0] != null)
                return protocolNodes[0];
            else {
                protocolNodes[0] = new ProtocolNode();
                return protocolNodes[0];
            }
        }
        else {
            if(protocolNodes[1] != null)
                return protocolNodes[1];
            else {
                protocolNodes[1] = new ProtocolNode();
                return protocolNodes[1];
            }
        }
    }

    public ProtocolNode get(String protocol){
        if(protocol.equals("tcp")){
            return protocolNodes[0];
        }
        else {
            return protocolNodes[1];
        }
    }
}
