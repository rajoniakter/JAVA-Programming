import java.util.Scanner;
public class question7 {
	public static void main(String args[])
	{
		int s1,s2;
		Scanner Obj=new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		s1=Obj.nextInt();
		System.out.println("Enter the second integer: ");
		s2=Obj.nextInt();
		
		s1=s1+s2;
		s2=s1-s2;
		s1=s1-s2;
		
		
		System.out.print("After swap, ");
		System.out.println("The first integer is: "+s1);
		System.out.println("The second integer is: "+s2);
	}

}
