public class Account{
	public String AccNo;
	public double balance;
	public Account(String AccNo, double balance){
		this.AccNo = AccNo;
		this.balance = balance;
		}
		void deposit(double amount){
		  if(amount<=0){
			try{throw new IllegalArgumentException("Invalid amount has entered");}
			 catch(IllegalArgumentException ex){
			   System.out.println(ex.getMessage());
				}
			 }
		      else{
			balance = balance+amount;
			System.out.println(balance);
			}
			}
			void checkBalance(){
			System.out.println("Total Balance is:"+balance);
			}
			public static void main(String args[]){
			  Account ac1 = new Account("A123WXR7",35000.0);
			  ac1.deposit(-500);
			  ac1.checkBalance();
					
		}
}
