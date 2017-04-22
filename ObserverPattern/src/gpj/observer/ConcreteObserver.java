package gpj.observer;
/**
 * 具体的观察者对象，实现更新方法，使自身的状态和目标的状态保持一致
 * @author gpj
 *
 */
public class ConcreteObserver implements Observer {

	//观察者状态
	private String observerState; 
	
	/**
	 * 获取目标类状态同步到观察者状态
	 */
	@Override
	public void update(Subject subject) {
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}

}