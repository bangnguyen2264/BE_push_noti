package com.example.pushnotification;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2

public class FirebaseMessagingService {

    private final FirebaseMessaging firebaseMessaging;

    public void sendNotification(NotificationMessage message) throws FirebaseMessagingException {
        Notification notification = Notification.builder()
                .setTitle(message.getTitle())
                .setBody(message.getMessage())
                .build();

        Message msg = Message.builder()
                .setToken("dXXRc9T1R0e1ooCKB3ZliH:APA91bGfqR1A784-6pH_9ObluVpr07u8yaVg348hctGt9UovGfWMvS8n2Hq1qchFKBVpm09M5mBmuX-p76EdbqeOqj6XtD1eo0rA1gmNXD_iKlUh49f24TGLlq2Upfi8Q0clEDu9s2fW")
                .setNotification(notification)
                .build();

        firebaseMessaging.send(msg);

    }
}




