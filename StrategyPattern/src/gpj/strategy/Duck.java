package gpj.strategy;

public abstract class Duck {
	public void setFlyStragety(FlyStragety flyStragety) {
		this.flyStragety = flyStragety;
	}

	private FlyStragety flyStragety;

	public void quack(){
		System.out.println("啦啦啦");
	}
	
	public abstract void display();
	
	public void fly(){
		flyStragety.performFly();
	}
}
