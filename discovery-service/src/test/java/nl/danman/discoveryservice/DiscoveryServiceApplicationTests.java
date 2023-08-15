package nl.danman.discoveryservice;

import nl.danman.su.spring.boot.starter.service.StartupService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

@SpringBootTest
class DiscoveryServiceApplicationTests {

    @SpyBean
    private StartupService startupServiceSpy;

    @Test
    void contextLoads() {
        assertTrue(true);
    }

    @Test
    void startUpService_isCalledAtStartup() {
        verify(startupServiceSpy).atStartUp();
    }

}
