import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x,y;
		int sum;
		
		System.out.print("첫 번째 숫자 입력 : ");
		x = input.nextInt();
		
		System.out.print("두 번재 숫자 입력 : ");
		y = input.nextInt();
		
		sum = x + y;
		System.out.println("합은 : " + sum);
	}

}
