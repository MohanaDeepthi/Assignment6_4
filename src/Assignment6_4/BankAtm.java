package Assignment6_4;

public class BankAtm {
	
	int atmId;
	String bankName;
	String location;
	static double  balance=50000.00;
	 public double balance() {
	        return balance;
	    }
	
	public void deposit(double amt){
		if(amt<=0){
			throw new IllegalArgumentException(String.format(
                    "Invalid deposit amount %s", amt));
		}
		
	}

	public void withdraw(double amt){
		if(amt>balance || balance < 10000){
			throw new BankATMException(String.format("Current balance %f is less than requested amount %f",balance, amt));
		}
		
		balance=balance-amt;
	}
	
}

@SuppressWarnings("serial")
class BankATMException extends RuntimeException{
	private String message;

	public BankATMException(String message) {
		this.message=message;
	}
	public BankATMException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }
	
}