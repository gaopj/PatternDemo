package gpj.myProxy;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {

		//ʵ�ֿ���
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʹ�С�����");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
