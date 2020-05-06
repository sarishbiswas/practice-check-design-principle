 package observerPattern;

public class SteveObserver implements INotificationObserver {
	String name = "Steve";
	@Override
	public void onServerDown() {
		System.out.println(name+" : Notification has been Recieved");
	}
	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}
	
}
