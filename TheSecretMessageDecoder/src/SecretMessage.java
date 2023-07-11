import java.util.Scanner;

public class SecretMessage {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println(secret(obj.next().charAt(0)));

	}
	public static int secret(char ch)
	{
		return (int)ch;
	}

}
