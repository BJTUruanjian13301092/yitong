package com.example.yitong.entity;

public class FirewallRuleEntity {

    private DirectionNode[] directionNodes;

    public FirewallRuleEntity(){
        directionNodes = new DirectionNode[2];
    }

    public DirectionNode add(String direction){
        if(direction.equals("inbound")){
            if(directionNodes[0] != null)
                return directionNodes[0];
            else {
                directionNodes[0] = new DirectionNode();
                return directionNodes[0];
            }
        }
        else {
            if(directionNodes[1] != null)
                return directionNodes[1];
            else {
                directionNodes[1] = new DirectionNode();
                return directionNodes[1];
            }
        }
    }

    public DirectionNode get(String direction){
        if(direction.equals("inbound")){
            return directionNodes[0];
        }
        else {
            return directionNodes[1];
        }
    }
}
