package abstractFactoryPattern;

public class IndianCarFactory extends AbstractCarFactory {
	public Car getCar(CarType model) {
		if(model == CarType.LUXURY)
			return new LuxuryCar(Location.INDIA);
		else if(model == CarType.MICRO)
			return new MicroCar(Location.INDIA);
		else
			return new MiniCar(Location.INDIA);
	}
}
