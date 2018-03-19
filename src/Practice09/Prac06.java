package Practice09;

public class Prac06 {
	void startChat(String chatId) {
		String nickname = null;
		nickname = chatId;
		Chat chat = new Chat() {
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "["+chatId+"]"+inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	class Chat{
		void start() {};
		void sendMessage(String message) {}
	}

}
