package gpj.templateMethod;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

/**
 * 为所有子类提供一个算法框架
 * 
 * 一款提神饮料
 * @author gpj
 *
 */
public abstract class RefreshBeverage {

	/**
	 * 制备饮料的模板方法
	 * 封装了所有子类共同遵循的算法框架
	 */
	public final void prepareBeverageTemplate(){
		//1 将水煮沸
		boilWater();
		
		//2 泡制饮料
		brew();
		
		//3将饮料倒入杯中
		pourInCup();
		
		//4加入调味料
		if(isCustomerWantsCondiments())
		{
			addCondiments();
		}
	
	}

	/**
	 * 询问用户是否加入调料
	 * 钩子函数，提供一个默认或空的实现
	 * 具体的子类可以自行决定是否挂钩，及如何挂钩
	 * @return
	 */
	protected boolean isCustomerWantsCondiments() {
		return true;
	}

	private void boilWater(){
		System.out.println("将水煮沸");
	}
	protected abstract void brew();
	protected abstract void addCondiments();

	private void pourInCup() {
		System.out.println("倒入杯中");
		
	}




}
