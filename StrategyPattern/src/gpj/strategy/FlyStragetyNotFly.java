package gpj.strategy;

public class FlyStragetyNotFly implements FlyStragety {

	@Override
	public void performFly() {
		System.out.println("我不会飞啊");
	}

}
