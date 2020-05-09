package com.cognizant.observerpattern;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotificationService implements INotificationService{
	private static final Logger LOGGER = LogManager.getLogger(NotificationService.class);

	List<INotificationObserver> list = new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver o) {
		list.add(o);
		LOGGER.debug(list);
	}

	@Override
	public void RemoveSubscriber(INotificationObserver o) {
		list.remove(o);
		LOGGER.debug(list);
	}

	@Override
	public void NotifySubscriber() {
		for(INotificationObserver i : list) {
			i.OnServerDown();
		}
	}
	
}
