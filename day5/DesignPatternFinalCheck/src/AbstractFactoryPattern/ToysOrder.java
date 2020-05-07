package AbstractFactoryPattern;

public class ToysOrder extends Order{

	public ToysOrder(Channel channel) {
		super(channel,ProductType.Toys);
		processOrder();
	}
	@Override
	public void processOrder() {
		System.out.println("Toy order is being processed");
	}

}
