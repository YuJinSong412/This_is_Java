package Exercise09;

class Button2{
	OnClickListener2 listener;
	
	void setOnClickListener(OnClickListener2 listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	interface OnClickListener2{
		void onClick();
	}
}
class Window{
	Button2 btn = new Button2();
	Button2 btn2 = new Button2();
	
	Button2.OnClickListener2 listener = new Button2.OnClickListener2() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
			
		}
	};
	
	Window(){
		btn.setOnClickListener(listener);
		btn2.setOnClickListener(new Button2.OnClickListener2() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
				
			}
		});
	}
}
public class Ex07 {

	public static void main(String[] args) {
		Window win = new Window();
		win.btn.touch();
		win.btn2.touch();

	}

}
