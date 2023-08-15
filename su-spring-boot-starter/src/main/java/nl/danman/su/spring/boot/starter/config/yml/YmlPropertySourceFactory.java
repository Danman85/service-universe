package nl.danman.su.spring.boot.starter.config.yml;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.lang.NonNull;

import java.util.Objects;
import java.util.Properties;

public class YmlPropertySourceFactory implements PropertySourceFactory {

    @NonNull
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource encodedResource) {
        final YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(encodedResource.getResource());

        final Properties ymlProperties = factoryBean.getObject();

        return new PropertiesPropertySource(Objects.requireNonNull(encodedResource.getResource().getFilename()),
                Objects.requireNonNull(ymlProperties));
    }
}
