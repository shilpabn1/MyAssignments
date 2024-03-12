package week2.day3;

public class Edge extends Browser{
	
	public void takeSnap() {
		System.out.println("take snap");
	}
	public void clearCookies() {
		System.out.println("clear all the clearCookies ");
	}
	public static void main(String[] args) {
		Edge Ed1=new Edge();
		System.out.println(Ed1.browserName);
		System.out.println(Ed1.browserVersion);
		Ed1.openURL();
		Ed1.closeBrowser();
		Ed1.navigateBack();
		Ed1.takeSnap();
		Ed1.clearCookies();

	}

}
