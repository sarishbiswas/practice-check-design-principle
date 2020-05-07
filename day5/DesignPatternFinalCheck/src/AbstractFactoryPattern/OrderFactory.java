package AbstractFactoryPattern;

public class OrderFactory {
public static AbstractOrderFactory getFactory(ProductType type) {
	if(type==ProductType.Electronics)
		return new ElectronicsFactory();
	else if(type==ProductType.Toys)
		return new ToysFactory();
	else return new FurnitureFactory();
}
public static Order BuildOrder(Channel channel,ProductType type) {
	return getFactory(type).getProduct(channel);
}
}
