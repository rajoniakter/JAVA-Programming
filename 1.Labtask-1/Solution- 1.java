import java.util.Scanner;
public class question1 {
	public static void main(String args[])
	{
		int lbound=1;
		int ubound=100;
		int sum=0;
		
		
		while(lbound<=ubound)
		{
			sum=sum+lbound;
			lbound++;
		}
		System.out.println("the sum of 1 to 100 is" +sum);
		System.out.println("the avg is" +(float)sum/ubound);
		
	}

}
