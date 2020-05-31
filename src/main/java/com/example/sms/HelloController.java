package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.diffpack.DiffCong;
import com.example.sms.anotherconfig.AnotherConfig;
import com.example.sms.configuration.Configuration;
import com.example.sms.service.EmployeeService;

@RestController
public class HelloController {
    @Autowired
    private ComponentScan componentScan;
    
    @Autowired
    private EmployeeService employeeService;
    
    
    
    @Autowired
    private AnotherConfig anotherConfig;
    
    @Autowired
    private    Configuration configuration;
    
    
    @Autowired
    private DiffCong diffCong;
    
    @RequestMapping("/")
    public String index() {
        System.out.println(configuration.getMaximum());
        employeeService.getAllEmployees();
        componentScan.getComponentName();
        diffCong.getCongNo();
        anotherConfig.getAnother();
        return "Greetings from Spring Boot!";
    }
}
