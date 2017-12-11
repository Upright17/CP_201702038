import java.util.Scanner;

public class column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double radius;// 원기둥밑면의 반지름
		double height;// 원기둥의 높이
		double volume;// 원기둥의 부피
		System.out.print("원기둥 밑면의 반지름을 입력하세요:");
		radius = input.nextDouble();

		System.out.print("원기둥의 높이를 입력하세요:");
		height = input.nextDouble();

		volume = 3.141592 * radius * radius * height;
		System.out.print("원기둥의 부피는 "+volume+"입니다.");
	}

}
