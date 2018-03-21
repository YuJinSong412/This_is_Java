package Exercise11;

public class Ex34 {

	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("value: "+obj); //자동박싱
		
		int value = obj;
		System.out.println("value: "+obj); // 대입 시 자동언박싱
		
		int result = obj+100;
		System.out.println("result: "+result); //연산시 자동 언박싱

	}

}
