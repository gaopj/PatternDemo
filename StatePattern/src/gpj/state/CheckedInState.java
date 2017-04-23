package gpj.state;

public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间有人已经住了!别打扰");
	}

}
