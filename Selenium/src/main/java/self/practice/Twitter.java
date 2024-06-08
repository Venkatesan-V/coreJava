package self.practice;

public class Twitter {

	public static void main(String[] args) {
		Login credentialsTwitter = new Login();
		System.out.println(credentialsTwitter.username);
		System.out.println(credentialsTwitter.password);
		
		credentialsTwitter.enterUsername();
		credentialsTwitter.enterPassword();
		credentialsTwitter.clickedLogin();

	}

}
