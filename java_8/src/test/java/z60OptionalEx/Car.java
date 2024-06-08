package z60OptionalEx;

public class Car {

	private String name;
	private Insurance insurance;
	
	public Car (String name, Insurance insurance) {
		super();
		this.name = name;
		this.insurance = insurance;
	}
	
	public String getName() {
		return name;
	}
	
	public Insurance getInsurance() {
		return insurance;
	}
	
	
}
