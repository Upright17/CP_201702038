import java.util.Scanner;

public class MileKilometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometer;
		double mile;
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Ϸ����ּ���:");
		mile = input.nextDouble();
		kilometer = 1.609*mile;

		System.out.println(mile+"������"+kilometer+"ų�ι����Դϴ�.");
		
	}

}
