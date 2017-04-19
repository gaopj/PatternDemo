﻿package gpj.proxy;

/**
 * 
 * @author gpj
 * 继承方式实现代理
 */
public class Car2 extends Car {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行使。。。");
		
		super.move();
		
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行使。。。 汽车行使时间："
				+(endTime-startTime)+"毫秒");
	}

}
