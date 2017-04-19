package gpj.singletonCrack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;


/**
 * 测试反射和反序列化破解单例模式
 * @author gpj
 *
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		//通过反射的方式直接调用私有构造器
//		Class<Singleton> class1=  (Class<Singleton>)Class.forName("gpj.singletonCrack.Singleton");
//		Constructor<Singleton> c =class1.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		
//		Singleton s3 = c.newInstance();
//		Singleton s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化的方式构造多个对象
		Singleton2 s5 = Singleton2.getInstance();
		FileOutputStream fos = new FileOutputStream("./src/gpj/singletonCrack/singleton.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s5);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/gpj/singletonCrack/singleton.txt"));
		Singleton2 s6 = (Singleton2) ois.readObject();
		System.out.println(s5);
		System.out.println(s6);
	}

}
