package z16reusableUtilities7Style;

public class Runner {

	public static void main(String[] args) {
		
		String s1="SELENIUM";
		String s2="playwright";
		
		IStringUtils strUtils=new StringUtilsImp();
		
		
		String convertUP = strUtils.convertToUpperCase(s2);
		String convertLOW = strUtils.convertToLowerCase(s1);
		
		System.out.println(convertLOW);
		System.out.println(convertUP);
		
//		The above implementation occur in Before Java_8.
		
		
	}
}
