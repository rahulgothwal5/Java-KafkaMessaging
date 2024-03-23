package com.rahul.bookpublisher.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahul.bookpublisher.config.KafkaConfigProps;
import com.rahul.bookpublisher.domain.Book;
import com.rahul.bookpublisher.exceptions.BookPublishException;
import com.rahul.bookpublisher.services.BookPublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Publishes books to a Kafka topic.
 */
@Service
public class KafkaBookPublisherService implements BookPublisherService {

    @Autowired
    private  ObjectMapper objectMapper;

    @Autowired
    private  KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private  KafkaConfigProps kafkaConfigProps;

    @Override
    public void publish(final Book book) {
        try {
            final String payload = objectMapper.writeValueAsString(book);
            kafkaTemplate.send(kafkaConfigProps.getTopic(), payload);
        } catch (final JsonProcessingException ex) {
            throw new BookPublishException("Unable to publish book", ex, book);
        }
    }

}
