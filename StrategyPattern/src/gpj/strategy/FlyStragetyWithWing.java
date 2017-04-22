package gpj.strategy;

import gpj.strategy.FlyStragety;

public class FlyStragetyWithWing implements FlyStragety {

	@Override
	public void performFly() {
		System.out.println("用翅膀飞");
	}

}
