import java.util.Scanner;
public class question2 {
	public static void main(String args[])
	{
		int i=100, k=0;
		int sum=0;
		
		while(k<=i)
		{
			sum=sum+(k*k);
			
			k++;
		}
		System.out.println("The sum of the squares is:"+sum);
	}

}
