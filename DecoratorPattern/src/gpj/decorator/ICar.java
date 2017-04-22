package gpj.decorator;
/**
 * 抽象组件
 * @author gpj
 *
 */
public interface ICar {
	void move();
}

//被装饰对象
class Car implements ICar{

	@Override
	public void move() {
		System.out.println("地上跑。。");
	}
}

//装饰器角色
class SuperCar implements ICar{

	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
	protected ICar car;
	@Override
	public void move() {
		car.move();
	}
	
}

class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
	}
	public void fly(){
		System.out.println("天上飞。。");
	}
	@Override
	public void move() {
		super.move();
		fly();
	}
}

class WaterCar extends SuperCar{

	public WaterCar(ICar car) {
		super(car);
	}
	public void swim(){
		System.out.println("水上游。。");
	}
	@Override
	public void move() {
		super.move();
		swim();
	}
}

class 	IACar extends SuperCar{

	public IACar(ICar car) {
		super(car);
	}
	public void auto(){
		System.out.println("自动跑。。");
	}
	@Override
	public void move() {
		super.move();
		auto();
	}
}
