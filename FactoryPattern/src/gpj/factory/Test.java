﻿package gpj.factory;

/**
 * 模拟客户端实现
 * 
 * @author gpj
 *
 */
public class Test {

	public static void main(String[] args) {
		// HairInterface left = new LeftHair();
		// left.draw();
		// HairInterface right = new RightHair();
		// right.draw();

		HairFactory factory = new HairFactory();
//		HairInterface left = factory.getHair("left");
//		if (left != null)
//			left.draw();
		
//		HairInterface left =factory.getHairBYClass("gpj.factory.LeftHair");
//		left.draw();
		
		HairInterface left =factory.getHairByClassKey("in");
		left.draw();
	}
	

}
