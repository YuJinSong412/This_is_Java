package Practice08;

interface Action{
	void work();
}
public class Prac05 {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();

	}

}
