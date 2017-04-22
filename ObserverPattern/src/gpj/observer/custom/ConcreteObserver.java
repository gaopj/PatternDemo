package gpj.observer.custom;

public class ConcreteObserver implements Observer {



	private String observerName;
	
	private String content;
	
	private String remindThing;
	@Override
	public void update(Subject subject) {
		content=((ConcreteSubject)subject).getContent();
		System.out.println(observerName+"收到了"+content+","+remindThing);
	}

	@Override
	public void setObserverName(String observerName) {
		this.observerName=observerName;
	}

	@Override
	public String getObserverName() {
		return observerName;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

}
