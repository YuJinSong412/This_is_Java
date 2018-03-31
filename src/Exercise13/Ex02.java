package Exercise13;

class Product<T,M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return this.kind;
	}
	public M getModel() {
		return this.model;
	}
	public void setKind(T kind) { this.kind = kind;}
	public void setModel(M model) { this.model = model;}
}
class Tv{
	
}
class Car{
	
}
public class Ex02 {

	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<Tv,String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 Tv");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car,String> product2 = new Product<Car,String>();
		product2.setKind(new Car());
		product2.setModel("스마트 Tv");
		Car car = product2.getKind();
		String carModel = product2.getModel();

	}

}
