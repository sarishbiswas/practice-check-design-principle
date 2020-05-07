package AbstractFactoryPattern;

public class FurnitureFactory extends AbstractOrderFactory {

	@Override
	public Order getProduct(Channel channel) {
		// TODO Auto-generated method stub
		return new FurnitureOrder(channel);
	}

}
