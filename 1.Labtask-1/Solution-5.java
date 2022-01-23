import java.util.Scanner;
public class question5 {
	public static void main(String args[])
	{
		int r1,r2,r3;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter first number: ");
		r1=obj.nextInt();
		System.out.print("Enter second number: ");
		r2=obj.nextInt();
		System.out.print("Enter third number: ");
		r3=obj.nextInt();
		
		System.out.printf("Sum of the three number is: %d%n", r1 + r2 + r3);
		
		System.out.printf("Product of the three number is: %d%n", r1 * r2 * r3);
		
		System.out.printf("Minimum of the three number is: %d%n",  Math.min(Math.min(r1, r2), r3));
		
		System.out.printf("Maximum of the three number is: %d%n", Math.max(Math.max(r1, r2), r3));


	}

}
