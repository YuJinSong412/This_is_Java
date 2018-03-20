package Exercise11;

class Counter{
	private int no;
	
	Counter(int no){
		this.no= no;
	}
	
	protected void finalize() throws Throwable{
		System.out.println(no+"번 객체의 finalize()가 실행됨");
	}
}
public class Ex08 {

	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i=1;i<=50;i++) {
			counter = new Counter(i);
			
			counter = null;
			
			System.gc();
		}

	}

}
