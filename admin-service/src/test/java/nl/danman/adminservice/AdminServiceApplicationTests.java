package nl.danman.adminservice;

import nl.danman.su.spring.boot.starter.service.StartupService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.Mockito.verify;

@SpringBootTest
class AdminServiceApplicationTests {

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
