package week3.day1;

public abstract class CanaraBank implements Payment
{


public void cashOnDelivery() {
	System.out.println("Cash on delivery");
	
}

public void upiPayments() {
	System.out.println("Make an upi payements");
	
}

public void cardPayments() {
	System.out.println("Make cardpayements");
	
}

public void internetBanking() {
	System.out.println("make internetbanking ");
	
}

public abstract void recordPayementsDetails();
}
