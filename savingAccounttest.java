import java.util.Scanner;
public class savingAccounttest {

	public static void main(String[] args) {
	savingAccount sA1=new savingAccount("Jay",100134,100);
	savingAccount sA2=new savingAccount("Aileen",100190,1000);
	savingAccount sA3=new savingAccount("John",100153,3213);
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter your new Account information");
	String UserName=scanner.nextLine();
	int Pin=scanner.nextInt();
	double Balance=scanner.nextDouble();
	
	savingAccount currentAccount= new savingAccount(UserName, Pin, Balance);

	
	
	savingAccount overdarft=new savingAccount(UserName, Pin,Balance);
	
	
	}
	
}
