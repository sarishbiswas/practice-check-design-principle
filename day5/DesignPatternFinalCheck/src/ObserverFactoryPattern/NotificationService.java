package ObserverFactoryPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	List<INotificationObserver> observers;

	public NotificationService() {
		super();
		observers = new ArrayList<>();
	}

	@Override
	public void subscribe(INotificationObserver observer) {
		observers.add(observer);
		System.out.println("Subscriber Added SuccessFully. - " + observer);

	}

	@Override
	public void unsubscribe(INotificationObserver observer) {
		observers.remove(observer);
		System.out.println("SubScriber Removed Succesfully. - " + observer);
	}

	@Override
	public void notifymsg() {
		for (INotificationObserver iNotificationObserver : observers) {
			if (iNotificationObserver.getNoOfTickets() >= 100)
				iNotificationObserver.onTicketBooked();
		}

	}

}
