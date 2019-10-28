package com.example.yitong.service;

import com.example.yitong.YitongApplication;
import com.example.yitong.entity.FirewallRuleEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = YitongApplication.class)
public class FirewallTest {

    @Test
    public void firewallFunctionTest(){
        String filepath = "fw.csv";
        Firewall firewall = new Firewall(filepath);

        FirewallRuleEntity rules = new FirewallRuleEntity();
        rules.add("inbound").add("tcp").add(80).add("192.168.1.2");
        rules.add("outbound").add("udp").add(1000).add("52.12.48.92");
        rules.add("inbound").add("udp").add(53).add("192.168.1.1");
        firewall.loadRules(rules);

        firewall.checkInputs();
    }
}
