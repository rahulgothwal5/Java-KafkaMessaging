package com.rahul.authorpersistance.service.impl;

import com.rahul.authorpersistance.config.KafkaConfigProps;
import com.rahul.authorpersistance.domain.Notification;
import com.rahul.authorpersistance.exception.NotificationPublishException;
import com.rahul.authorpersistance.service.NotificationService;
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
            log.info("Payload : " + payload, kafkaConfigProps.getTopic());
            kafkaTemplate.send(kafkaConfigProps.getTopic(), payload);
        } catch (final JsonProcessingException ex) {
            throw new NotificationPublishException("Unable to publish notification", ex, notification);
        }
    }


}
