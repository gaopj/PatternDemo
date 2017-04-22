package gpj.strategy;

public class Client {
	public static void main(String[] args){
		System.out.println("开始测试。。");
		Duck duck=null;
		//duck = new GreenDuck();
		//duck = new RedDuck();
		duck = new RubberDuck();
		duck.display();
		duck.quack();
		duck.fly();
		

		System.out.println("测试结束！");
	}
}
