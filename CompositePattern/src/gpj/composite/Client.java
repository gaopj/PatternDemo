package gpj.composite;

public class Client {

	public static void main(String[] args) {
		AbstractFile f2,f3,f4,f5;
		Folder f1, f11,f12;
		
		f11 = new Folder("我的收藏");
		f2 = new ImageFile("鸡仔头像.jpg");
		f3 = new TextFile("鸡仔文件.txt");
		f11.add(f2);
		f11.add(f3);
		
		f12 = new Folder("我的电影");
		f4 = new VideoFile("鸡仔哈哈.avi");
		f5 = new VideoFile("鸡仔呵呵.avi");
		f12.add(f4);
		f12.add(f5);
		
		f1 = new Folder("我的文件");
		f1.add(f11);
		f1.add(f12);
		
		f2.killVirus();
		System.out.println("*******************");
		f11.killVirus();
		System.out.println("*******************");
		
		f1.killVirus();

	}

}
