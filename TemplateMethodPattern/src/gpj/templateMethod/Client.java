package gpj.templateMethod;

public class Client {

	public static void main(String[] args) {
		System.out.println("咖啡制备中。。。");
		RefreshBeverage beverage =new Coffee();
		beverage.prepareBeverageTemplate();
		System.out.println("咖啡好了！");
		
		System.out.println("*************");
		
		System.out.println("茶制备中。。。");
		RefreshBeverage beverage2 =new Tea();
		beverage2.prepareBeverageTemplate();
		System.out.println("茶好了！");
	}

}
