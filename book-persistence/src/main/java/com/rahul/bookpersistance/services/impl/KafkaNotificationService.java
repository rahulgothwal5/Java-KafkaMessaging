package com.rahul.bookpersistance.services.impl;

import com.rahul.bookpersistance.config.KafkaConfigProps;
import com.rahul.bookpersistance.domain.Notification;
import com.rahul.bookpersistance.exceptions.NotificationPublishException;
import com.rahul.bookpersistance.services.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Slf4j
public class KafkaNotificationService implements NotificationService {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private KafkaConfigProps kafkaConfigProps;

    @Override
    public void publishNotification(Notification notification) {
        try {
            final String payload = objectMapper.writeValueAsString(notification);
            log.info("Payload : " + payload, "notification.created");
            kafkaTemplate.send("notification.created", payload);
        } catch (final JsonProcessingException ex) {
            throw new NotificationPublishException("Unable to publish notification", ex, notification);
        }
    }


}
