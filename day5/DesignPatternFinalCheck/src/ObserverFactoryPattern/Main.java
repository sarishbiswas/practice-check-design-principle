package ObserverFactoryPattern;

public class Main {
	public static void main(String[] args) {
		INotificationObserver obj1=new Event1AdminObserver(102);
		INotificationObserver obj2=new Event2AdminObserver();
		NotificationService service=new NotificationService();
		service.subscribe(obj1);
		service.subscribe(obj2);
		service.notifymsg();
		service.unsubscribe(obj1);
	}
}
