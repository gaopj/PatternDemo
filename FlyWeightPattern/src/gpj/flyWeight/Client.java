package gpj.flyWeight;

public class Client {

	public static void main(String[] args) {
		ChessFlyWeight chessFlyWeight1= ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chessFlyWeight2= ChessFlyWeightFactory.getChess("黑色");
		System.out.println(chessFlyWeight1);
		System.out.println(chessFlyWeight2);
		
		System.out.println("\n增加外部状态处理........");
		chessFlyWeight1.display(new Coordinate(10, 10));
		chessFlyWeight2.display(new Coordinate(2, 2));
		
		
		

	}

}
