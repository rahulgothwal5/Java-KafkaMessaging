package com.rahul.bookpublisher.scheduled;

import com.rahul.bookpublisher.repositories.BookRepository;
import com.rahul.bookpublisher.services.BookPublisherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Publishes books at a fixed interval.
 */
@Component
@Slf4j
public class ScheduledBookPublisher {

    private long counter = 1;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookPublisherService bookPublisherService;

    @Scheduled(cron = "*/20 * * * * *")
    public void publishBook() {
        bookRepository.findById(counter).ifPresentOrElse(book -> {
            counter += 1;
            bookPublisherService.publish(book);
            log.info("Book '{}' [{}] published.", book.getTitle(), book.getIsbn());
        }, this::resetCounter);
    }

    private void resetCounter() {

        this.counter = 1;
    }

}
