package z62OptionalEx;

public class Runnerclass {

	public static void main(String[] args) {

		Person antony= new Person("Antony", new Car("i20", new Insurance("UHC")));
		System.out.println(antony.getCarInsuranceName(antony));
	
		Person tom = new Person ("Tom", null);
		System.out.println(tom.getCarInsuranceName(tom));

	}
}
