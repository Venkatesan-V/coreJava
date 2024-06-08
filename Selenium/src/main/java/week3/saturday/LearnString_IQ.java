package week3.saturday;

public class LearnString_IQ {

	public static void main(String[] args) {

		//	Interview: Print count of only uppercase letters

		String name= "pneQuWmEoRnToYuIlOtPrAacsilicovolcanoconiosis";
		int upper=0;
		int lower=0;

		for (int i = 0; i <= name.length()-1; i++) {
			char c = name.charAt(i);
			if (Character.isUpperCase(c)) {
				upper++;
				System.out.println(c);

			} else if (Character.isLowerCase(c)) {
				lower++;
				System.out.println(c);

			}
		}
		System.out.println(upper);
		System.out.println(lower);
		
	}
}