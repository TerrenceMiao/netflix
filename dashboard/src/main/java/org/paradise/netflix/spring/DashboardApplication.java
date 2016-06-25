package org.paradise.netflix.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@EnableHystrixDashboard
@EnableDiscoveryClient
@Controller
public class DashboardApplication {

	public static void main(String[] args) {

		SpringApplication.run(DashboardApplication.class, args);
	}


    @RequestMapping("/")
    public String home() {

        return "forward:/hystrix";
    }

}
