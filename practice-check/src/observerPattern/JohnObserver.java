 package observerPattern;

public class JohnObserver implements INotificationObserver {
	String name = "John";
	@Override
	public void onServerDown() {
		System.out.println(name+" : Notification has been Recieved");
	}
	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}
	

}
