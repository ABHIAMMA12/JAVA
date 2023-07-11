
import java.util.Scanner;

public class HeightApp {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		//double inch=obj.nextDouble();
		//obj.nextDouble();
		HeightConverter converter = new HeightConverter();
		System.out.printf("%.2f",converter.convertInchesToFeet(obj.nextDouble()));
		obj.close();
	}

}