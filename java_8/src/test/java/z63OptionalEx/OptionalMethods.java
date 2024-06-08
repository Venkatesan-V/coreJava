package z63OptionalEx;

import java.util.Optional;

import org.testng.annotations.Test;

public class OptionalMethods {

	@Test
	public void isPresentEx() {
		Optional<String> app = Optional.of("apple");
		System.out.println("Is present example: " +app.isPresent());
	}
	@Test
	public void isEmptyEx() {
		Optional<String> bana = Optional.of("banana");
		System.out.println("Is empty example: " +bana.isEmpty());
	}
	@Test
	public void ifPresentEx() {
		Optional<String> grape = Optional.of("grapes");
		grape.ifPresent(str->System.out.println("If Present Ex: " +str.length()));
	}
	@Test
	public void orElseEx() {
		String name=null;
		String result = Optional.ofNullable(name).orElse("ajith");
		System.out.println("or Else Example: " +result);
	}
	@Test
	public void getEx() {
		Optional<String> aar = Optional.of("Raja");
		aar.ifPresent(str-> System.out.println("Get Example: " +aar.get()));
	}
	@Test
	public void orElseGetEx() {
		String name= "Or Else Get Ex Agni";
		name=null;
		String result= Optional.ofNullable(name).orElseGet(()-> "Agni is not present. So I am gett returned");
		System.out.println(result);
	}
	@Test
	public void orElseThrowEx() {
		String name=null;
		String result= Optional.ofNullable(name).orElseThrow(()-> new IllegalArgumentException());
		System.out.println(result);
	}
	
	
	
}
