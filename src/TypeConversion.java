
public class TypeConversion {

	public static void main(String[] args) {
		int i;
		double f;
		
		f = 5 / 4; // 정수끼리의 나눗셈 후에 f에 대입되는 것이므로 1.25가 아닌 1.0의 결과값을 가짐
		System.out.println(f);
		
		f = (double) 5 / 4; // 5를 double형으로 강제 변환 후에 나눗셈한 값을 f에 대입한 것이므로 1.25의 결과값을 가짐
		System.out.println(f);
		
		i = (int) 1.3 + (int) 1.8;
		System.out.println(i);
	}

}
