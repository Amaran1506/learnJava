public class Bank
{
public static void main(String[] args)
{
Bank cashier = new Bank();
cashier.deposit();   //method calling statement
	
Bank customer = new Bank();
customer.deposit(500);      //arguments (500)
customer.deposit(500.5);
}

void deposit(int cash)
{
	System.out.println("depo "+cash);
}
void deposit()     //method name: deposittttt
{
	System.out.println("depo");
}
}

