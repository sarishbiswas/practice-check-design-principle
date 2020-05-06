package abstractFactoryPattern;
public class DefaultCarFactory extends AbstractCarFactory {
	public Car getCar(CarType model) {
		if(model == CarType.LUXURY)
			return new LuxuryCar(Location.DEFAULT);
		else if(model == CarType.MICRO)
			return new MicroCar(Location.DEFAULT);
		else
			return new MiniCar(Location.DEFAULT);
	}
}
