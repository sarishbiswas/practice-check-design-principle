package abstractFactoryPattern;

public class CarFactory {
	public static AbstractCarFactory getFactory(Location location) {
		if(location == Location.USA)
			return new UsaCarFactory();
		else if(location == Location.INDIA)
			return new IndianCarFactory();
		else
			return new DefaultCarFactory();
	}
	public static Car buildCar(CarType model,Location location) {
		return getFactory(location).getCar(model);
	}
}
