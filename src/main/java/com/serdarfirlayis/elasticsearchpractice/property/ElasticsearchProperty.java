package com.serdarfirlayis.elasticsearchpractice.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "elasticsearch")
@Data
public class ElasticsearchProperty {

    private String host;
    private int port;
}