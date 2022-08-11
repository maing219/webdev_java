import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		double ca;
		
		System.out.print("반지름을 입력하시오: ");
		radius = input.nextDouble();
		
		ca = 3.14 * radius * radius;
		System.out.println(ca);
	}

}
