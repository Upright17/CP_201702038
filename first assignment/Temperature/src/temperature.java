import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius;// ���� �µ�
		double fahrenheit;// ȭ���µ�
		Scanner input = new Scanner(System.in);
		System.out.print("ȭ���µ��� �Է��ϼ���:");
		fahrenheit = input.nextDouble();
		celsius = (fahrenheit - 32)*5/9;
System.out.println(fahrenheit+"ȭ���µ��� "+celsius+"�����µ��Դϴ�.");
	}

}
