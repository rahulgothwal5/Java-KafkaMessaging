package com.rahul.authorpersistance.exception;



import com.rahul.authorpersistance.domain.Notification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


public class NotificationPublishException extends RuntimeException {

    @Getter
    private Notification notification;

    public NotificationPublishException(Notification notification) {
        this.notification = notification;
    }

    public NotificationPublishException(String message, final Notification notification) {
        super(message);
        this.notification = notification;
    }

        public NotificationPublishException(Throwable cause, final Notification notification) {
        super(cause);
        this.notification  = notification;
    }

    public NotificationPublishException(String message, Throwable cause, final Notification notification) {
        super(message, cause);
        this.notification  = notification;
    }

    public NotificationPublishException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace, final Notification notification) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.notification = notification;
    }


}
