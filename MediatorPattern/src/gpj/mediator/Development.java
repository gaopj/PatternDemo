package gpj.mediator;

public class Development implements Department {

	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);
	}

	private Mediator m;
	@Override
	public void selfAction() {
		System.out.println("专心研发。。");
	}

	@Override
	public void outAction() {
		System.out.println("研发经费不够了，要钱！！");
	}

}
