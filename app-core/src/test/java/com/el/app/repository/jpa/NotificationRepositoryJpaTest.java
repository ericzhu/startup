package com.el.app.repository.jpa;

import javax.inject.Inject;

import org.junit.Test;

import com.el.app.BaseIntegrationTest;
import com.el.app.model.Notification;
import com.el.app.repository.NotificationRepository;

public class NotificationRepositoryJpaTest extends BaseIntegrationTest {
	
	@Inject
	NotificationRepository notificationRepository;
	
	@Test
	public void testSave() {
		notificationRepository.save(new Notification());
	}
}