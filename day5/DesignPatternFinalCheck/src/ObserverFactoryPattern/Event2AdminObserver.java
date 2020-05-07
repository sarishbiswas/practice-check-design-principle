package ObserverFactoryPattern;

public class Event2AdminObserver implements INotificationObserver{

	String name;
	int noOfTickets;
	
	public Event2AdminObserver() {
		super();
		this.name = "Event2Admin";
	}
	public Event2AdminObserver(int noOfTickets) {
		super();
		this.name = "Smith";
		this.noOfTickets = noOfTickets;
	}
	@Override
	public void onTicketBooked() {
		System.out.println("more than 100 tickets has been booked received by "+name);
	}
	@Override
	public String toString() {
		return "SmithadminObserver [name=" + name + "]";
	}
	@Override
	public int getNoOfTickets() {
		// TODO Auto-generated method stub
		return noOfTickets;
	}
	

}
