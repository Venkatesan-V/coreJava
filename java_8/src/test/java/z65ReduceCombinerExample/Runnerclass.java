package z65ReduceCombinerExample;

import java.util.Arrays;
import java.util.List;

public class Runnerclass {

	public static void main(String[] args) {

		Person antony= new Person("Antony",35,  new Car("i20", new Insurance("UHC")));
		System.out.println(antony.getCarInsuranceName(antony));
	
		Person tom = new Person ("Tom", 40, null);
		System.out.println(tom.getCarInsuranceName(tom));

		List<Person> listOfPersons = Arrays.asList(antony, tom);
		Integer result = listOfPersons.stream().reduce(0,
				(total,person)->total+person.getAge(),
				Integer::sum);
		System.out.println(result);
	}
}
