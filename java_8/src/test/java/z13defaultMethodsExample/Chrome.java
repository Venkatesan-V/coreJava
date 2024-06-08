package z13defaultMethodsExample;

public class Chrome implements Browser {

	public void browse() {
		System.out.println("chrome browser");
	}
	
	public void mediaPlayer() {
		System.out.println("Browser_Chrome media player");
	}
	
	public static void main(String[] args) {
		
		Browser chrome=new Chrome();
		chrome.mediaPlayer();
		chrome.mediaPlayer007();
		chrome.mediaPlayer008();
		chrome.browse();
		
		
	}
}
