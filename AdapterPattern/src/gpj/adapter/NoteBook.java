package gpj.adapter;

public class NoteBook {

	private ThreePlug plug;
	
	public NoteBook(ThreePlug plug)
	{
		this.plug = plug;
	}
	
	
	//  ʹ�ò������ 
	public void charge() {
		plug.powerWithThree();
	}
	public static void main(String[] args) {
		GBTwoPlug twoPlug = new GBTwoPlug();
		ThreePlug threePlug=new TwoPlugAdapter(twoPlug);
		NoteBook noteBook= new NoteBook(threePlug);
		noteBook.charge();
		
	    threePlug=new TwoPlugAdapterExtends();
	    noteBook = new NoteBook(threePlug);
	    noteBook.charge();
	}

}
