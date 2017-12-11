import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius;// ¼·¾¾ ¿Âµµ
		double fahrenheit;// È­¾¾¿Âµµ
		Scanner input = new Scanner(System.in);
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä:");
		fahrenheit = input.nextDouble();
		celsius = (fahrenheit - 32)*5/9;
System.out.println(fahrenheit+"È­¾¾¿Âµµ´Â "+celsius+"¼·¾¾¿ÂµµÀÔ´Ï´Ù.");
	}

}
