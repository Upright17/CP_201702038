import java.util.Scanner;

public class CmFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double feet;
		double cm;
		double inch;
		Scanner input = new Scanner(System.in);
		System.out.print("cm Ű�� �Է����ּ���:");
		cm = input.nextDouble();
		inch = cm / 2.54;
		feet = inch / 12;
		System.out.print(cm + "cm�� " + feet + "��Ʈ " + inch + "��ġ�Դϴ�.");

	}
}
