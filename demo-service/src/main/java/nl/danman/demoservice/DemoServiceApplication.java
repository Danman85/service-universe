package nl.danman.demoservice;

import nl.danman.su.spring.boot.starter.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoServiceApplication implements CommandLineRunner {

    @Autowired
    private StartupService startupService;

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        this.startupService.atStartUp();
    }
}
