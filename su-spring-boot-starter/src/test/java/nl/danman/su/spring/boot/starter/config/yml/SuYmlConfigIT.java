package nl.danman.su.spring.boot.starter.config.yml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SuYmlConfigIT {

    @Autowired
    private SuYmlConfig suYmlConfig;

    @Test
    void nameIsSet() {
        assertEquals("Service Universe", suYmlConfig.getName());
    }
}