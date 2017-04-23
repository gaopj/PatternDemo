package gpj.command;
//命令的调用者和发起者
public class Invoke {

	public Invoke(Command command) {
		super();
		this.command = command;
	}

	private Command command;//也可以通过List<Command> 容纳很多命令，进行批处理。数据库底层事务管理就是类似结构
	
	//业务方法，用户调用命令类的方法
	public void call(){
		command.execute();
	}
	
}
