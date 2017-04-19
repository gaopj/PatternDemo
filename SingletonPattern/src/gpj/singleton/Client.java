﻿package gpj.singleton;

public class Client {
	public static void main(String[] args) {
		//饿汉模式
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1==s2);
		
		//懒汉模式
		SingletonLazy s3 = SingletonLazy.getInstance();
		SingletonLazy s4 = SingletonLazy.getInstance();
		System.out.println(s3==s4);
		System.out.println(s3);
		System.out.println(s4);
		
		//枚举模式
		Singleton5 s5 = Singleton5.INSTANCE;
		Singleton5 s6 = Singleton5.INSTANCE;
		System.out.println(s5);
		System.out.println(s6);
	}

}
