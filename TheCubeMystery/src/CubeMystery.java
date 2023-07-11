import java.util.Scanner;

public class CubeMystery {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	System.out.println(cubeNumber(obj.nextInt()));

	}
	public static int  cubeNumber(int num)
	{
		return (int)Math.pow(num, 3);
	}
}
