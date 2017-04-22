package gpj.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyStragety(new FlyStragetyNotFly());
	}
	@Override
	public void display() {
		System.out.println("橡胶做的");
	}
	
	@Override
	public void quack(){
		System.out.println("哈哈哈");
	}

}
