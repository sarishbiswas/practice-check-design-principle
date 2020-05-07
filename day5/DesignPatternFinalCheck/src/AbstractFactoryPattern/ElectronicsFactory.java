package AbstractFactoryPattern;

public class ElectronicsFactory extends AbstractOrderFactory {

	@Override
	public Order getProduct(Channel channel) {
		return new ElectronicsOrder(channel);
	}

}
