package patterns;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestaurantFactoryProducer rProducer = new RestaurantFactoryProducer();
		RestaurantAbstractFactory rFactory = rProducer.getRestaurantAbstractFactory(1);
		RestaurantAbstractFactory rFactory2 = rProducer.getRestaurantAbstractFactory(2);

		System.out.println(rFactory.getDrink("soda"));
		System.out.println(rFactory.getFastFood("hot dog"));
		System.out.println(rFactory.getFastFood("empanada"));

		System.out.println(rFactory2.getDrink("juice"));
		System.out.println(rFactory2.getFastFood("pizza"));
		System.out.println(rFactory2.getFastFood("sandwich"));
	}

}
