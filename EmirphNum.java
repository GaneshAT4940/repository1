import java.util.Scanner;
class EmirphNum
{
/*logic for the emirph num is 
    First we check the num is prime or not 
    Second if the num is prime then the rev the num 
    Third after getting the rev num again it check rev num prime or not 
If Both the numbers are prime then it called Emirph
*/ 
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Num : ");
		int num = sc.nextInt();
		int count=0;
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				count++;
				break;
			}
		}
		boolean flag=count==0?true:false;
		if (flag)
		{
			int rev=0;
			while (num!=0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num/=10;
			}
			int count1=0;
			for (int i=2;i<rev;i++)
			{	
				if (rev%i==0)
				{
					count1++;
					break;
				}	
			}
			boolean flag1=count1==0?true:false;
			System.out.println(flag&&flag1?"Emirph num":"Not Emirph");
			
		}else{
			System.out.println("Not Emirph num");
		}
		
	}
}
