package gpj.memento;
/**
 * 备忘录类
 * @author gpj
 *
 */
public class EmpMemento {
	public EmpMemento(Emp emp) {
		this.ename =emp.getEname();
		this.age = emp.getAge();
		this.salary = emp.getSalary();
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private String ename;
	private int age;
	private int salary;
	
}
