package AbstractFactoryPattern;

public class ElectronicsOrder extends Order{
	public ElectronicsOrder(Channel channel) {
		super(channel,ProductType.Electronics);
		processOrder();
	}

	@Override
	public void processOrder() {
    System.out.println("Electronics order is being processed");		
	}

}
