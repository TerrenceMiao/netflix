package org.paradise.netflix.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.amqp.EnableTurbineAmqp;



@SpringBootApplication
@EnableTurbineAmqp
@EnableEurekaClient
public class TurbineApplication {

	public static void main(String[] args) {

		SpringApplication.run(TurbineApplication.class, args);
	}

}
