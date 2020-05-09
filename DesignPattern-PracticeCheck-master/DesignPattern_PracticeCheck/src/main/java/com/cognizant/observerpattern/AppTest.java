package com.cognizant.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppTest {
	private static final Logger LOGGER = LogManager.getLogger(AppTest.class);
	public static void main(String[] args) {
		INotificationObserver steve = new SteveObserver();
		INotificationObserver john = new JohnObserver();
		INotificationService service = new NotificationService();
		
		LOGGER.info("start");
		LOGGER.info("Adding Subscriber");
		service.AddSubscriber(john);
		LOGGER.info("Subscriber Notification");
		service.NotifySubscriber();
		LOGGER.info("Adding Subscriber");
		service.AddSubscriber(steve);
		LOGGER.info("Subscriber Notification");
		service.NotifySubscriber();
		LOGGER.info("Removing Subscriber");
		service.RemoveSubscriber(john);
		LOGGER.info("Subscriber Notification");
		service.NotifySubscriber();
		LOGGER.info("end");
	}
}
