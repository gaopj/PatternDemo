package gpj.mediator;

public class Finacial implements Department {

	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);
	}

	private Mediator m;
	@Override
	public void selfAction() {
		System.out.println("钱太多，给钱。。");
	}

	@Override
	public void outAction() {
		System.out.println("汇报，钱太多，咋整？");
	}

}
