package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {
	List<INotificationObserver> observers;
	public NotificationService() {
		observers = new ArrayList<INotificationObserver>();
	}
	@Override
	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		for (INotificationObserver iNotificationObserver : observers) {
			System.out.println(iNotificationObserver);
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		for (INotificationObserver iNotificationObserver : observers) {
			System.out.println(iNotificationObserver);
		}
	}

	@Override
	public void notifySubscriber() {
		for (INotificationObserver iNotificationObserver : observers) {
			iNotificationObserver.onServerDown();
		}
	}

}
