package gpj.templateMethod;

public class Tea extends RefreshBeverage {

	@Override
	protected void  brew() {
		System.out.println("用热水冲泡茶");

	}

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");

	}
	
	@Override
	/**
	 * 子类选择挂载钩子函数，通过覆盖的形式选择挂载钩子函数
	 */
	protected boolean isCustomerWantsCondiments() {
		return false;
	}

}
