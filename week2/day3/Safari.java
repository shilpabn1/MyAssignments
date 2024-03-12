package week2.day3;

public class Safari extends Browser{

	public void readerMode() {
		System.out.println(" Read in mode");
	}
	public void fullScreenMode() {
		System.out.println("makefullscreenmode");
	}
	public static void main(String[] args) {
		Safari SF=new  Safari();
				System.out.println(SF.browserName);
				System.out.println(SF.browserVersion);
				SF.closeBrowser();
				SF.openURL();
				SF.navigateBack();
				SF.readerMode();
				SF.fullScreenMode();
	}

}
