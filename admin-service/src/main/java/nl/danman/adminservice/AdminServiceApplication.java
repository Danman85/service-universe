package nl.danman.adminservice;

import nl.danman.su.spring.boot.starter.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class AdminServiceApplication implements CommandLineRunner {

    @Autowired
    private StartupService startupService;

    public static void main(String[] args) {
        SpringApplication.run(AdminServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        this.startupService.atStartUp();
    }
}
