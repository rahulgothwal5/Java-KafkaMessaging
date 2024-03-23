package com.rahul.bookpersistance.services;


import com.rahul.bookpersistance.domain.Notification;

public interface NotificationService {
    void publishNotification(Notification notification);
}
