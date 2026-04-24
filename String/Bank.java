//Design a class bank with the data member Customer ID, Account Number, Name, Account Type, Balance
//Member function Initialize the necessary details using constructor
//Void Deposite(amnt)
//Void withdraw(amnt) minimum balance in account 2000
//Void show-display all the details

class Bank
{

	private int accno;
	private	String cname;
	private char type;
	private double balance;
	Bank(){}
	Bank(int accno, String cname, char type, double balance)
	{
		this.accno=accno;		
		this.cname=cname;
		this.type=type;
		this.balance=balance;
	}
	void deposit(double amt)
	{
		balance+=amt;
	}
	void withdraw(double amt)
	{
		if(amt<=balance-2000)
			balance-=amt;
		else
			System.out.println("Insufficient balance");
	}
	void show()
	{
		System.out.println("Account no="+accno);
		System.out.println("Customer Name="+cname);
		System.out.println("Account type="+type);
		System.out.println("Account Balance="+balance);
	}
	public static void main(String args[])
	{
		Bank b1=new Bank(1001,"A,Roy",'s',10000);
		b1.show();
		b1.deposit(5000);
		b1.show();
		b1.withdraw(20000);
		b1.withdraw(5000);
		b1.show();
	}
}


		

