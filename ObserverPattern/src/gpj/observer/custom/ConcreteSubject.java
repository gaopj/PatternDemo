package gpj.observer.custom;

public class ConcreteSubject extends Subject {

	//情况1，情况2，情况3
	
	private String content; 
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
		this.notifyObservers();
	}
	@Override
	protected void notifyObservers() {
		//循环所有注册的观察者
		for (Observer observer : observers) {
			//规则：
			//鸡仔一号 情况2通知，情况1,3不通知
			//鸡仔二号 情况2,3通知，情况1不通知
			
			//如果情况1 都不通知
			
			//如果情况2
			if("情况2".equals(this.getContent()))
			{
				if("鸡仔一号".equals(observer.getObserverName())){
					observer.update(this);
				}
				else if("鸡仔二号".equals(observer.getObserverName())){
					observer.update(this);
				}
			}
			
			//如果情况3
			if("情况3".equals(this.getContent()))
			{
			    if("鸡仔二号".equals(observer.getObserverName())){
					observer.update(this);
				}
			}
		}
	}

}
