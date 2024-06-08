package z60OptionalEx;

public class Person {

	private String name;
	private Car car;
	
	public Person (String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}
	
	public String getName() {
		return name;
	}
	
	public Car getCar() {
		return car;
	}
	
	public String getCarInsuranceName(Person person) {
		if(person!=null) {
			Car car = person.getCar();
			if(car!=null) {
				Insurance insurance = car.getInsurance();
				if(insurance!=null) {
					return insurance.getName();
				}
			}
		}
		
		return "one of the value is NULL";
	}
	
}
