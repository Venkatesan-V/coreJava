package z60OptionalEx;

public class Runner {

	public static void main(String[] args) {
		
		Person antony= new Person("Antony", new Car("i10", new Insurance("Cigna")));
		System.out.println(antony.getCarInsuranceName(antony));
		
		Person ram = new Person ("Ram", null);
		System.out.println(ram.getCarInsuranceName(ram));
		
	}
}
