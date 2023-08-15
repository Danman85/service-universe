package nl.danman.configservice;

import nl.danman.su.spring.boot.starter.service.StartupService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.Mockito.verify;

@SpringBootTest
class ConfigServiceApplicationTests {

    @SpyBean
    private StartupService startupServiceSpy;

    @Test
    void contextLoads() {
    }

    @Test
    void startUpService_isCalledAtStartup() {
        verify(startupServiceSpy).atStartUp();
    }

}
