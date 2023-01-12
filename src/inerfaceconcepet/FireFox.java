package inerfaceconcepet;

public class FireFox implements Browser {

	
	public void openBrowser() {
		System.out.println("openBrowser methode from FireFox class");
	}

	
	public void closeBrowser() {
		System.out.println("closeBrowser methode from FireFox class");
	}

	
	public void refresh() {
		System.out.println("refersh methode from FireFox class");
		
	}

	
	public void bookmark() {
		System.out.println("bookmark methode from FireFox class");
	}
	public void privateWindow()
	{
		System.out.println("privatewindow methode from FireFox class");
	}
	public static void main(String[] args) {
		FireFox ff=new FireFox();
		ff.openBrowser();
		System.out.println(variables.i);
	}

}
