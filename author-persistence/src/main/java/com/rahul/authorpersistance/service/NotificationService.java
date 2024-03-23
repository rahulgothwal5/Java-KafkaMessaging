package com.rahul.authorpersistance.service;


import com.rahul.authorpersistance.domain.Notification;

public interface NotificationService {
    void publishNotification(Notification notification);
}
