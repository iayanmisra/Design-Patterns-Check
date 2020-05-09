package com.designpattern.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	private static final Logger LOGGER = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		LOGGER.info("start");

		INotificationService service = new NotificationService();
		
		INotificationObserver admin1 = new Admin(service, "Aman1", 100);
		// less than or equal to 100 so it doesnt print
		INotificationObserver admin3 = new Admin(service, "Aman", 102);
		INotificationObserver admin2 = new Admin(service, "Agarwal", 101);
		// more than 100 so it print
		service.addObserver(admin1);
		service.addObserver(admin2);
		service.addObserver(admin3);
		//adding all the observer
		service.notifyObserver();
		//calling observer greater than 100
		service.removeObserver(admin2);
		//removing admin2
		service.notifyObserver();
		LOGGER.info("end");
	}
}