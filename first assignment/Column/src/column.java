import java.util.Scanner;

public class column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double radius;// ����չظ��� ������
		double height;// ������� ����
		double volume;// ������� ����
		System.out.print("����� �ظ��� �������� �Է��ϼ���:");
		radius = input.nextDouble();

		System.out.print("������� ���̸� �Է��ϼ���:");
		height = input.nextDouble();

		volume = 3.141592 * radius * radius * height;
		System.out.print("������� ���Ǵ� "+volume+"�Դϴ�.");
	}

}
