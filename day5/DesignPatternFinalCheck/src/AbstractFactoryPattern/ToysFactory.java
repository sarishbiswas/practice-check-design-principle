package AbstractFactoryPattern;

public class ToysFactory extends AbstractOrderFactory {

	@Override
	public Order getProduct(Channel channel) {
		// TODO Auto-generated method stub
		return new ToysOrder(channel);
	}

}
