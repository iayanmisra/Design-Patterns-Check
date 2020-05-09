package com.cognizant.observerpattern;

public interface INotificationService {
	void AddSubscriber(INotificationObserver o);
	void RemoveSubscriber(INotificationObserver o);
	void NotifySubscriber();
}
