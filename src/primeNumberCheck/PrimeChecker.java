package primeNumberCheck;

public class PrimeChecker {
	int count;
	PrimeChecker()
	{
		count = 0;
	}
	public void display(int n) {
		for (int i=1; i<=n; i++) {
			if (n%i==0)
			{
				count = count + 1;
			}
		}
		if (count==2)
		{
			System.out.println(n + " is prime number");
		}
		else
		{
			System.out.println(n + " is not a prime number");
		}
	}
}
