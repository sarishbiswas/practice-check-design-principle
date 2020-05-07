package ObserverFactoryPattern;

public class Event1AdminObserver implements INotificationObserver{

	private String name;
	private int noOfTickets;
	public Event1AdminObserver(int noOfTickets) {
		super();
		this.name = "Event1Admin";
		this.noOfTickets = noOfTickets;
	}
	@Override
	public void onTicketBooked() {
		System.out.println("more than 100 tickets has been booked : received by "+name);
	}
	@Override
	public String toString() {
		return "LeoadminObserver [name=" + name + "]";
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	

}
