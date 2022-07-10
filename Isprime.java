package week1.day1;

public class Isprime {

	public static void main(String[] args) {

		int n =5;
		int rem = 0;
		for (int i =2; i<=n-1 ; i++)
		{
			if(n%i == 0)
			{
				System.out.println("Given number is a non prime number");
				rem =1;
				break;
			}
		}
		if (rem == 0)
		{
			System.out.println("Given number is a prime number");
		}
	}

}


