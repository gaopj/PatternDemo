package gpj.strategy;

public class RedDuck extends Duck {

	public RedDuck() {
		super();
		super.setFlyStragety(new FlyStragetyWithWing());
	}

	@Override
	public void display() {
		System.out.println("我头红色的");
	}

}
