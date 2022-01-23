import java.util.Scanner;
public class question8 {
	public static void main(String args[])
	{
		int r,i,sum=0;
		Scanner Obj=new Scanner(System.in);
		
		System.out.print("Enter positive integer: ");
		r=Obj.nextInt();
		
		System.out.println("the sum of all digits: ");
		while(r!=0)
		{ 
			i=r%10;
			sum=sum+i;
			r=r/10;
			
		}
		System.out.print(sum);
	}

}
