import java.util.Scanner;

public class CmFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double feet;
		double cm;
		double inch;
		Scanner input = new Scanner(System.in);
		System.out.print("cm 키를 입력해주세요:");
		cm = input.nextDouble();
		inch = cm / 2.54;
		feet = inch / 12;
		System.out.print(cm + "cm는 " + feet + "피트 " + inch + "인치입니다.");

	}
}
