package com.example.diffpack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiffCongFactory {
    
    @Bean
    DiffCong   getDiffCong(){
        DiffCong d=new DiffCong();
        d.setCongNo(1);
        return d;
        
    }

}
