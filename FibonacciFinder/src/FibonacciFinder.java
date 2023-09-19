import java.util.Scanner;
public class FibonacciFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		long a = 0, b = 1, c = b;
		int fib, count;
		
		System.out.println("Enter nth fibonacci number: ");
		fib = input.nextInt();
		
		for (count = 0; count < fib; count++) {
			b += a;
			a = c;
			c = b;
		}// while
		
		System.out.println(a);
		
		
	} // end main

} // end class
