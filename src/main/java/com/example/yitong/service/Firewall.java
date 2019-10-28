package com.example.yitong.service;

import com.example.yitong.entity.FirewallRuleEntity;
import com.example.yitong.util.CsvReaderUtil;
import java.util.List;

public class Firewall {

    List<String[]> dataList;

    FirewallRuleEntity rules;

    public Firewall(String filepath) {
        dataList = CsvReaderUtil.readCSV(filepath);
    }

    public void loadRules(FirewallRuleEntity firewallRuleEntity){
        rules = firewallRuleEntity;
    }

    private boolean accept_packet(String direction, String protocol, String port, String ipAddress){
        try{
            return rules.get(direction).get(protocol).get(Integer.valueOf(port)).get(ipAddress);
        }
        // Null pointer exception
        catch (Exception e) {
            return false;
        }
    }

    public void checkInputs(){
        for(String[] str : dataList){
            System.out.println(accept_packet(str[0], str[1], str[2], str[3]));
        }
    }
}
