package com.bwgjoseph.sdmdocrefbug;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

@Configuration
public class MongoConfig {
    @Bean
    MongoCustomConversions conversions() {
        return new MongoCustomConversions(List.of(new ReferenceAbleConverter()));
    }
}
