package com.example.yitong.entity;

public class PortNode {
    // Part1
    private boolean[] ipaddress1;
    // Part2
    private boolean[] ipaddress2;
    // Part3
    private boolean[] ipaddress3;
    // Part4
    private boolean[] ipaddress4;

    public PortNode(){
        // 255 + 1
        ipaddress1 = new boolean[256];
        ipaddress2 = new boolean[256];
        ipaddress3 = new boolean[256];
        ipaddress4 = new boolean[256];
    }

    public void add(String ipAddress){
        if(!ipAddress.contains("-")){
            String[] split = ipAddress.split("\\.");
            ipaddress1[Integer.valueOf(split[0])] = true;
            ipaddress2[Integer.valueOf(split[1])] = true;
            ipaddress3[Integer.valueOf(split[2])] = true;
            ipaddress4[Integer.valueOf(split[3])] = true;
        }
        else {
            String[] split = ipAddress.split("-");
            String[] splitLeft = split[0].split("\\.");
            String[] splitRight = split[1].split("\\.");
            // part1
            for(int i=Math.min(Integer.valueOf(splitLeft[0]), Integer.valueOf(splitRight[0]));
                i<=Math.max(Integer.valueOf(splitLeft[0]), Integer.valueOf(splitRight[0])); i++){
                ipaddress1[i] =true;
            }
            // part2
            for(int i=Math.min(Integer.valueOf(splitLeft[1]), Integer.valueOf(splitRight[1]));
                i<=Math.max(Integer.valueOf(splitLeft[1]), Integer.valueOf(splitRight[1])); i++){
                ipaddress2[i] =true;
            }
            // part3
            for(int i=Math.min(Integer.valueOf(splitLeft[2]), Integer.valueOf(splitRight[2]));
                i<=Math.max(Integer.valueOf(splitLeft[2]), Integer.valueOf(splitRight[2])); i++){
                ipaddress3[i] =true;
            }
            // part4
            for(int i=Math.min(Integer.valueOf(splitLeft[3]), Integer.valueOf(splitRight[3]));
                i<=Math.max(Integer.valueOf(splitLeft[3]), Integer.valueOf(splitRight[3])); i++){
                ipaddress4[i] =true;
            }
        }
    }

    public boolean get(String ipAddress){
        String[] split = ipAddress.split("\\.");
        return ipaddress1[Integer.valueOf(split[0])]
                && ipaddress2[Integer.valueOf(split[1])]
                && ipaddress3[Integer.valueOf(split[2])]
                && ipaddress4[Integer.valueOf(split[3])];
    }
}
