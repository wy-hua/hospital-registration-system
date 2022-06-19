package com.example.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("package com.example.hosp.mapper")
public class HospConfig {
}
