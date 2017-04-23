package gpj.mediator;

public class Market implements Department {

	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);
	}
	private Mediator m;
	@Override
	public void selfAction() {
		System.out.println("陪客户吃喝玩乐");

	}

	@Override
	public void outAction() {
		System.out.println("汇报。。拉客户要钱！");
		m.command("finacial");

	}

}
