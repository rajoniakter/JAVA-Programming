import java.util.Scanner;
public class question3 {
	public static void main(String args[])
	{
		int n=10,i=1;
		int product=1;
		
		while(i<=n)
		{
			product=product*i;
			
			System.out.print(" "+i);
			
			i++;
		}
		System.out.println("  the product of integers is:"+product);
	}

}
