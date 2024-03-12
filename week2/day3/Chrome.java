package week2.day3;

public class Chrome extends Browser {
	
	public void openIncognito() {
		System.out.println("Open incognito");
	}

	public void clearCache() {
		System.out.println("Clear all the Cache");
	}

	public static void main(String[] args) {
		Chrome ch1=new Chrome();
		System.out.println(ch1.browserName);
		System.out.println(ch1.browserVersion);
		ch1.openURL();
		ch1.closeBrowser();
		ch1.navigateBack();
		ch1.openIncognito();
		ch1.clearCache();

	}

}
