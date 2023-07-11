
import java.util.Scanner;

public class SiApp {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.printf("%.2f",calculator.calculateSimpleInterest(obj.nextDouble(),obj.nextDouble(),obj.nextDouble()));
		obj.close();
	}

}
//1000.0, 0.05, 2.0
