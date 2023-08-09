package Test;

public class implementsClass implements ATM {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
		System.out.println("money is withdraw");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[]args) {
		ATM a = new implementsClass();
		a.withdraw();
	}

}
