package gpj.prototype;

import java.util.Date;

import javax.xml.crypto.Data;

/**
 * 实现深复制
 * @author gpj
 *
 */
public class Sheep2 implements Cloneable{

	
	public Sheep2(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}
	public Sheep2() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object object = super.clone();//直接调用Object的clone方法
		
		//添加如下代码实现深复制
		Sheep2 sheep = (Sheep2)object;
		sheep.birthday = (Date)this.birthday.clone();
		return object;
	}
	private String name;
	private Date birthday;
	
	
}