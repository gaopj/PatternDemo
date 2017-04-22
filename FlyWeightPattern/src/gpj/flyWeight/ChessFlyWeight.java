package gpj.flyWeight;
/**
 * 享元类
 * @author gpj
 *
 */
public interface ChessFlyWeight {

	String getColor();
	void display(Coordinate coordinate);
}

class ConcreteChess implements ChessFlyWeight
{

	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	private String color; 

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate coordinate) {
		System.out.println("棋子颜色"+color);
		System.out.println("棋子位置:("+coordinate.getX()+","+coordinate.getY()+")");	
	}
	
}
