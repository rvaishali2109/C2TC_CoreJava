package corejava_package;

public class classexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0,a;
		try {
		 a=42/d;
		System.out.println("This will not be printed");
		}catch(ArithmeticException e){
			System.out.println("Division by zero");
		}
		System.out.println("This will get printed");}}
		
