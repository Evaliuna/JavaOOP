public class Calculator{
	public static void main(String[] args){
		int a = 10;//Checked Exception
		int b = 0;
		
		int add = a+b;
		//j lines of code e exception hobe she lines of code try bock e rakhbo. then try ai exception ta generate korbe ar catch block she exception catch korbe)
		try{
		 int div = a/b; //Unchecked Exception
		 System.out.println(div);
		}
		catch(ArithmeticException e){
		 System.out.println(e);
		}
		//this finally block will always exicute even though it faces any exception or not
		finally{
		 System.out.println("Arithmatic operations have been initialized");
		}
		
		System.out.println(add);
		System.out.println("A basic calculator is designed");
		
		}
}
