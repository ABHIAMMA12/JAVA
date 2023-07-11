
import java.util.Scanner;

public class ContoHoursv {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println(convertToHours(obj.nextInt()));
		obj.close();
	}
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}
}