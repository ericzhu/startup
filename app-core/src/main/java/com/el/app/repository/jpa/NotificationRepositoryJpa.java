package com.el.app.repository.jpa;

import org.springframework.stereotype.Repository;

import com.el.app.model.Notification;
import com.el.app.repository.NotificationRepository;

@Repository("notificationRepositoryJpa")
public class NotificationRepositoryJpa extends BaseRepositoryJpa<Notification, Long> implements NotificationRepository {

}