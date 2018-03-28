package Exercise12;

class DataBox{
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: "+returnValue);
		data = null;
		notify();
		return returnValue;
	}
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: "+data);
		notify();
	}
}
class ProducerThread extends Thread{
	private DataBox dataBox;
	
	ProducerThread(DataBox dataBox){
		this.dataBox = dataBox;
	}
	public void run() {
		for(int i=1;i<=3;i++) {
			String data = "Data-"+i;
			dataBox.setData(data);
		}
	}
}
class ConsumerThread extends Thread{
	private DataBox dataBox;
	
	ConsumerThread(DataBox dataBox){
		this.dataBox = dataBox;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			String data = dataBox.getData();
		}
	}
}
public class Ex13 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread pro = new ProducerThread(dataBox);
		ConsumerThread con = new ConsumerThread(dataBox);
		
		pro.start();
		con.start();

	}

}
