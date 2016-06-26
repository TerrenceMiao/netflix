package org.paradise.netflix.spring;

import com.github.vanroy.cloud.dashboard.config.EnableCloudDashboard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCloudDashboard
public class CloudDashboardApplication {

	public static void main(String[] args) {

		SpringApplication.run(CloudDashboardApplication.class, args);
	}

}
