package com.bubua12.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 *
 * @author bubua12
 * @since 2024/5/29 9:36
 */
@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class Bubua12CloudNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(Bubua12CloudNacosApplication.class, args);
        log.info("*************Bubua12CloudNacosApplication start successfully... ... O(∩_∩)O");
    }
}
