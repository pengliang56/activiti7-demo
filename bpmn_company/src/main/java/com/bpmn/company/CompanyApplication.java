package com.bpmn.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import com.ihrm.common.entity.IdWorker;

@SpringBootApplication(scanBasePackages = "com.bpmn")
@EntityScan("com.bpmn")
public class CompanyApplication {

  public static void main(String[] args) {
    SpringApplication.run(CompanyApplication.class, args);
  }

  @Bean
  public IdWorker idWorkker() {
    return new IdWorker(1, 1);
  }
}
