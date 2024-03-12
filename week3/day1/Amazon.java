package week3.day1;

public class Amazon extends CanaraBank
{

	@Override
	public void recordPayementsDetails() {
	System.out.println("Payement complted");
		
	}

	public static void main(String[] args) {
		Amazon AM=new Amazon();
		AM.cashOnDelivery();
		AM.upiPayments();
		AM.cardPayments();
		AM.internetBanking();
		AM.recordPayementsDetails();
	}
}
