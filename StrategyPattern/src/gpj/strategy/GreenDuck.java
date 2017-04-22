package gpj.strategy;

public class GreenDuck extends Duck {

	public GreenDuck() {
		super();
		super.setFlyStragety(new FlyStragetyWithWing());
	}

	@Override
	public void display() {
		System.out.println("我脖子绿色的");
	}

}
