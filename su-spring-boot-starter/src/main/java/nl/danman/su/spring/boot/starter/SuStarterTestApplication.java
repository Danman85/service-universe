package nl.danman.su.spring.boot.starter;

import lombok.extern.slf4j.Slf4j;
import nl.danman.su.spring.boot.starter.config.yml.SuYmlConfig;
import nl.danman.su.spring.boot.starter.service.StartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Class is only here for testing purposes
 */
@SpringBootApplication
@Slf4j
public class SuStarterTestApplication implements CommandLineRunner {

    @Autowired
    private StartupService startupService;
    @Autowired
    private SuYmlConfig suYmlConfig;

    public static void main(String[] args) {
        SpringApplication.run(SuStarterTestApplication.class, args);
    }

    @Override
    public void run(String... args) {
        startupService.atStartUp();
        log.info("Loaded SU starting properties:");
        log.info(suYmlConfig.toString());
    }
}
