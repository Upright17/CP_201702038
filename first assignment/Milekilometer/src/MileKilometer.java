import java.util.Scanner;

public class MileKilometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometer;
		double mile;
		Scanner input = new Scanner(System.in);
		System.out.println("마일을 일력해주세요:");
		mile = input.nextDouble();
		kilometer = 1.609*mile;

		System.out.println(mile+"마일은"+kilometer+"킬로미터입니다.");
		
	}

}
