import java.util.Scanner;
public class question4 {
	public static void main(String args[])
	{
		int m, fm=1,sm=1, fibo = 1, j=1;
		int sum=0;
		float avg=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter fibonacci number: ");
		m=obj.nextInt();
		System.out.printf("the first "+m+ " fibonacci numbers are:",+m);
		
		while (j<=m)
		{
			sum=sum+fm;
			
			System.out.print(fm + " ");
			fibo = fm + sm ;
			fm = sm;
			sm = fibo;
			j++;
		}
		System.out.print("& the avg is: "+(float)sum/m);
	}

}
