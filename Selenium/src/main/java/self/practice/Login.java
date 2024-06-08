package self.practice;

public class Login {

	String username="TestLeaf";
	String password="password";
	
	public void enterUsername() {
	System.out.println("Entered the username as TestLeaf");
	}
	public void enterPassword() {
	System.out.println("Entered the password as password");
	}
	public void clickedLogin() {
	System.out.println("Clicked Login successfully");
	}
	public int noOfusers() {
	int x=10;
	return x;
	}
	public boolean fresher() {
		boolean fresher = false;
		return fresher;
		
	}
	public int add(int y, int x) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		Login credentialsFb = new Login();
		System.out.println(credentialsFb.username);
		System.out.println(credentialsFb.password);
		
		credentialsFb.enterUsername();
		credentialsFb.enterPassword();
		credentialsFb.clickedLogin();
		credentialsFb.noOfusers();
		credentialsFb.fresher();
		credentialsFb.add(10, 15);
		
		int users=credentialsFb.noOfusers();
		int manipulateNumber=users+10;
		boolean newUser=credentialsFb.fresher();
		
		System.out.println("noOfusers " + users);
		System.out.println(+manipulateNumber);
		System.out.println("is He fresher " +newUser);
		System.out.println(credentialsFb.add(10,15));
	}

}
