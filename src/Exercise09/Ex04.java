package Exercise09;

class Button{
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	interface OnClickListener{
		void onClick();
	}
}
class CallListener implements Button.OnClickListener{
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
class MessageListener implements Button.OnClickListener{
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}
}
public class Ex04 {

	public static void main(String[] args) {
		Button button = new Button();
		
		button.setOnClickListener(new CallListener());
		button.touch();
		
		button.setOnClickListener(new MessageListener());
		button.touch();

	}

}
