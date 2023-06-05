package com.manu.s.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig
{

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    // spring will automatically create a topic in kafka server
    @Bean
    public NewTopic topic()
    {
        return TopicBuilder.name(topicName)
                .build();
    }
}
