
import java.util.Scanner;

public class HalfTheNumber {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.printf("%.2f",halveTheNumber(obj.nextDouble()));
		obj.close();

	}
	public static double halveTheNumber(double num)
	{
		return num/2;
	}

}