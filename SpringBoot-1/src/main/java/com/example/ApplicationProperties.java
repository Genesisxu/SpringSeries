package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Gensis on 2016/9/7.
 */
@Component
public class ApplicationProperties {
    @Value("${com.god.test1}")
    private String test1;

    @Value("${com.god.value}")
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
