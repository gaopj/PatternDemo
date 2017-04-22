package gpj.flyWeight;

/**
 * 外部状态UnSharedConcreteFlyWeigth
 * @author gpj
 *
 */
public class Coordinate {
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	int x,y;
}
