package com.rahul.notification.services.impl;

import com.rahul.notification.domain.Notification;
import com.rahul.notification.repositories.NotificationRepository;
import com.rahul.notification.services.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class NotificationServiceImpl implements NotificationsService {

    @Autowired
    private NotificationRepository notificationRepository;


    @Override
    public Notification save(final Notification notification) {

        return notificationRepository.save(notification);
    }

    @Override
    public Page<Notification> listNotifications(final Pageable pageable) {
        return notificationRepository.findAll(pageable);
    }

}
