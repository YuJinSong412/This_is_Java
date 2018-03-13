package Practice06;

class ShopService{
	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopService;
	}
}
public class Prac18 {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();

		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		}else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}

}
