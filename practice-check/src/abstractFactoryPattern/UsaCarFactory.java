package abstractFactoryPattern;
public class UsaCarFactory extends AbstractCarFactory{
	public Car getCar(CarType model) {
		if(model == CarType.LUXURY)
			return new LuxuryCar(Location.USA);
		else if(model == CarType.MICRO)
			return new MicroCar(Location.USA);
		else
			return new MiniCar(Location.USA);
	}
}
