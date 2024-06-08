package z62OptionalEx;

import java.util.Optional;



public class Car {

	private String name;
	private Optional<Insurance> insurance;
	
	public Car (String model, Insurance insurance) {
		super();
		this.name = model;
		this.insurance = Optional.ofNullable(insurance);
	}
	
	public String getName() {
		return name;
	}
	
	public Optional<Insurance> getInsurance() {
		return insurance;
	}
	
}
