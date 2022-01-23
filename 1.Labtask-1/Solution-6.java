import java.util.Scanner;
public class question6 {
	public static void main(String args[])
	{
		int r1,r2,temp;
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter first number: ");
		r1=Obj.nextInt();
		System.out.println("Enter second number: ");
		r2=Obj.nextInt();
		temp=r2;
		r2=r1;
		r1=temp;
		
		System.out.print("After swap, ");
		System.out.println("the first number is: "+r1);
		System.out.println("the second number is: "+r2);
	}

}
