package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Gensis on 2016/9/7.
 */
@Configuration
@ConfigurationProperties(locations = "classpath:application.properties",prefix = "com.god")
public class ApplicationPropertiesWithConfigurationProperties {
    private String test1;

    private String value;

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
