package z9InterfaceExample;

@FunctionalInterface 
//this annotation will not allow another method/function, it will throw compile time exception
public interface Drivable {

	void drive(); 
	int hashCode();
	boolean equals(Object obj);
	
}
