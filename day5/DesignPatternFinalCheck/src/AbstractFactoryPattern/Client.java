package AbstractFactoryPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(OrderFactory.BuildOrder(Channel.Ecommerce, ProductType.Toys));
		System.out.println(OrderFactory.BuildOrder(Channel.Ecommerce, ProductType.Furniture));
		System.out.println(OrderFactory.BuildOrder(Channel.Ecommerce, ProductType.Electronics));
		System.out.println(OrderFactory.BuildOrder(Channel.TeleCaller, ProductType.Furniture));
		System.out.println(OrderFactory.BuildOrder(Channel.TeleCaller, ProductType.Toys));
		System.out.println(OrderFactory.BuildOrder(Channel.TeleCaller, ProductType.Electronics));
	}

}
