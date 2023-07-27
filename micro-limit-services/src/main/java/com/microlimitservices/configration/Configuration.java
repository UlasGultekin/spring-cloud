package com.microlimitservices.configration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("limit-services")
public class Configuration {
    private int min;
    private int max;
}
