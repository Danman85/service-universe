package nl.danman.configservice;

import nl.danman.su.spring.boot.starter.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication implements CommandLineRunner {

    @Autowired
    private StartupService startupService;

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        startupService.atStartUp();
    }
}
