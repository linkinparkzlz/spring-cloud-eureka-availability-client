package com.example.springcloudeurekaavailabilityclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableDiscoveryClient
public class SpringCloudEurekaAvailabilityClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaAvailabilityClientApplication.class, args);
	}
}
