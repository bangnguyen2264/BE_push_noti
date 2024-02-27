package com.example.pushnotification;

import com.google.firebase.messaging.FirebaseMessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class FirebaseMessagingController {

    private final FirebaseMessagingService firebaseMessagingService;

    @PostMapping
    public void sendNotificationByToken(@RequestBody NotificationMessage notificationMessage) throws FirebaseMessagingException {
        firebaseMessagingService.sendNotification(notificationMessage);
    }
}
