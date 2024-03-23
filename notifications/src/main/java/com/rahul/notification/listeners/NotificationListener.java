package com.rahul.notification.listeners;

import com.rahul.notification.domain.Notification;
import com.rahul.notification.services.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

@Component
@Profile("production")
@Slf4j
public class NotificationListener {

	@Autowired
    private  ObjectMapper objectMapper;

	@Autowired
	private  NotificationsService notificationService;


	@KafkaListener(topics = "notification.created")
	public String listens(final String in) {
		log.info("Received Notification: {}", in);
		try {
			final Notification notification = objectMapper.readValue(in, Notification.class);

			final Notification savedNotification = notificationService.save(notification);

			log.info("Notification '{}' persisted!", savedNotification.getTimestamp().toString());

		} catch(final JsonProcessingException ex) {
			log.error("Invalid message received: {}", in);
		}

		return in;
	}

}
