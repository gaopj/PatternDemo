package gpj.observer.custom;

public interface Observer {
	public void update(Subject subject);
	
	//设置观察者名称
	public void setObserverName(String observerName);
	
	//取得观察者名称
	public String getObserverName();
}
