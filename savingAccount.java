
public class savingAccount {

	String UserName;
	int Pin;
	double Balance;
	
	public savingAccount(String UserName2, int Pin2, double Balance2) {

	UserName= UserName2;	
	Pin=Pin2;
	Balance=Balance2;
	}
public double Withdraw(double a) {
	double sum1= a - Balance;
	return sum1; 
}
public double Desposit(double b) {
	double sum2=b + Balance;
	return sum2; 
}
}

