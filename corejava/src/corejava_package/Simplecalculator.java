package corejava_package;

public class Simplecalculator {
		
		void Prnsqr(int i)
		{
			System.out.println("square of int "+i+" is "+i*i);
		}
		void prnsqr(int f) {
			System.out.println("square of float"+f+" is "+ f*f);
		}
		void Prnsqr(char c) {
			System.out.println(c+" is a character");
		}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Simplecalculator ob=new Simplecalculator();
			ob.prnsqr(4.4);
		}
}