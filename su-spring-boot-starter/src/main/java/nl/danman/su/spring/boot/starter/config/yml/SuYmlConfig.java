package nl.danman.su.spring.boot.starter.config.yml;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Yml config of application-su-starter.yml
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "su")
@PropertySource(value = "classpath:/application-su-starter.yml", factory = YmlPropertySourceFactory.class)
public class SuYmlConfig {

    private String name;

    @Override
    public String toString() {
        return String.format("""
                Properties{
                    name='%s'
                }
                """,
                name);
    }
}
