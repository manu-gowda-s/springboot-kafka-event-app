package com.manu.s.emailservice.kafka;

import com.manu.s.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEmailConsumer
{
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderEmailConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeEmailOrder(OrderEvent orderEvent)
    {
        LOGGER.info(String.format("Consuming Order Events Details in Email-Service --> %s", orderEvent.toString()));
        // after that we can send email to Customers
    }
}
