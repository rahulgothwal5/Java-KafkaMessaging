package com.rahul.notification.controllers;

import com.rahul.notification.domain.Notification;
import com.rahul.notification.services.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationsController {

    @Autowired
    private NotificationsService notificationsService;


    @GetMapping(path="/notifications")
    public Page<Notification> listNotifications(final Pageable pagable) {
        return notificationsService.listNotifications(pagable);
    }

}
