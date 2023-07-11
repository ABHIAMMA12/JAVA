
import java.util.Scanner;
public class Area {
		public static void main(String[] args) {
			Scanner obj=new Scanner(System.in);
			//double r=obj.nextDouble();
			SareaCircle area=new SareaCircle();
			System.out.printf("%.2f",area.calculateSurfaceArea(obj.nextDouble()));
			obj.close();
	}


}
