package com.rahul.notification.repositories;

import com.rahul.notification.domain.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface NotificationRepository extends CrudRepository<Notification, Long>,
        PagingAndSortingRepository<Notification, Long> {
}
