package Practice.no18;

public class ShopService {

	private static ShopService shop = new ShopService();
	ShopService() {}
	
	public static ShopService getInstance() {
		return shop;
	}

}
