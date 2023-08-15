package nl.danman.su.spring.boot.starter.config;

import lombok.extern.slf4j.Slf4j;
import nl.danman.su.spring.boot.starter.config.yml.SuYmlConfig;
import nl.danman.su.spring.boot.starter.service.StartupService;
import nl.danman.su.spring.boot.starter.service.StartupServiceImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * Startup configuration for SU services
 */
@AutoConfiguration
@Import(SuYmlConfig.class)
@Slf4j
public class SuStartupAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public StartupService helloService() {
        return new StartupServiceImpl();
    }

}
