package com.stark.springbootcloudconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootCloudConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudConsulApplication.class, args);
	}

}
