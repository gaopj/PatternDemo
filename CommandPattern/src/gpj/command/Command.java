package gpj.command;
/**
 * 将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化；
 * 对请求排队或者记录请求日志，以及支持可撤销的操作
 * @author gpj
 *
 */
public interface Command {
	/**
	 * 实际项目可以根据需求设计多个不同方法
	 */
	void  execute();
}

class ConcreteCommand implements Command{

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	private Receiver receiver;//命令的真正执行者
	@Override
	public void execute() {
		System.out.println("调用前处理。。。");
		receiver.action();
		System.out.println("调用后处理。。。");
		
	}
	
}
