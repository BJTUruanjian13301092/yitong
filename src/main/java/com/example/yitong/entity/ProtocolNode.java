package com.example.yitong.entity;

import java.util.ArrayList;
import java.util.List;

public class ProtocolNode{

    private PortNode[] portNodes;

    public ProtocolNode(){
        // 65535 + 1
        portNodes = new PortNode[65536];
    }

    public PortNode add(int port){
        if(portNodes[port] != null)
            return portNodes[port];
        else {
            portNodes[port] = new PortNode();
            return portNodes[port];
        }
    }

    public List<PortNode> add(String port){
        List<PortNode> list = new ArrayList<>();
        String[] split = port.split("-");
        for(int i=Integer.valueOf(split[0]); i<=Integer.valueOf(split[1]); i++){
            if(portNodes[i] != null)
                list.add(portNodes[i]);
            else {
                portNodes[i] = new PortNode();
                list.add(portNodes[i]);
            }
        }
        return list;
    }

    public PortNode get(int port){
        return portNodes[port];
    }

    public List<PortNode> get(String port){
        List<PortNode> list = new ArrayList<>();
        String[] split = port.split("-");
        for(int i=Integer.valueOf(split[0]); i<=Integer.valueOf(split[1]); i++){
            list.add(portNodes[i]);
        }
        return list;
    }
}
