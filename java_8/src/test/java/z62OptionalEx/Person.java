package z62OptionalEx;

import java.util.Optional;

public class Person {

	private String name;
	private Optional<Car> car;

	public Person (String name, Car car) {
		super();
		this.name = name;
		this.car = Optional.ofNullable(car);
	}

	public String getName() {
		return name;
	}

	public Optional<Car> getCar() {
		return car;
	}

	public String getCarInsuranceName(Person person) {

		Optional<Person> optPerson = Optional.ofNullable(person);

		return optPerson
				.flatMap(Person::getCar)
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("one of the value is Null");
		
	}
}
