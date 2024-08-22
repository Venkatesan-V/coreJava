package z13defaultMethodsExample;

@FunctionalInterface //removed but doesn't affect other classes
public interface Browser {

	void browse();

	default void mediaPlayer() {
		System.out.println("Browser media player");
	}
	// default is keyword not accessSpecifier.
	// any number of default methods allowed

	default void mediaPlayer007() {
		System.out.println("Browser media player bass boosted");
	}

	default void mediaPlayer008() {
		System.out.println("Browser media player tremble boosted");
	}






}
