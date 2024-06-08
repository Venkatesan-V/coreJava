package z61OptionalEx;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.Optional;

import org.testng.annotations.Test;

public class CreateOptionalObjectEx {

	@Test
	public void testCreateEmpty() {
		Optional<String> empty = Optional.empty();
		assertTrue(empty.isEmpty());
//		assertTrue(empty.isPresent());
	}
	@Test
	public void testUsingOf() {
		String name="Agni";
		Optional<String> nonNull = Optional.of(name);
//		assertTrue(nonNull.isEmpty());
//		assertTrue(nonNull.isPresent());
//		when name=null then we will get NullPointerException
	}
	
	@Test
	public void testUsingOfNullable() {
		String name="Agni";
		name=null;
		Optional<String> nonNulle = Optional.ofNullable(name);
//		assertTrue(nonNulle.isEmpty());
//		assertTrue(nonNulle.isPresent());
//		assertFalse(nonNulle.isPresent());
//		when name=null then we will get NullPointerException
	}
	
	
	
}
