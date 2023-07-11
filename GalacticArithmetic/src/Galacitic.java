import java.util.Scanner;

public class Galacitic {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		long a=obj.nextLong();
		long b=obj.nextLong();
		System.out.println(galacticAddition(a,b));
		
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}
}
