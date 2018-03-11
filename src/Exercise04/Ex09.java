package Exercise04;

public class Ex09 {

	public static void main(String[] args) {
		Outter: for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break Outter;
			}
		}
		System.out.println("프로그래밍 종료");
	}

}
