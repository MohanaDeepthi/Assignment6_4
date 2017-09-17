package Assignment6_4;

public class Assignment6_4 {
	
	public static void main(String args[]){
		BankAtm ba1=new BankAtm();
		BankAtm ba2=new BankAtm();
		BankAtm ba3=new BankAtm();
		
	    ba3.withdraw(100.0);
	    ba2.deposit(110);
	    ba1.withdraw(45000);
	    ba1.withdraw(4000);

	    System.out.println("Current Balance "+ba1.balance());
	    
	}

}
