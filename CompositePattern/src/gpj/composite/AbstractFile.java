package gpj.composite;

import java.util.ArrayList;
import java.util.List;


//抽象构建
public interface AbstractFile {

	void killVirus();
}

class ImageFile implements AbstractFile{
	public ImageFile(String name) {
		super();
		this.name = name;
	}
	private String name;
	@Override
	public void killVirus() {
		System.out.println("图像文件："+name+",杀！");
		
	}
}

class TextFile implements AbstractFile{
	public TextFile(String name) {
		super();
		this.name = name;
	}
	private String name;
	@Override
	public void killVirus() {
		System.out.println("文本文件："+name+",杀！");
		
	}
}

class VideoFile implements AbstractFile{
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	private String name;
	@Override
	public void killVirus() {
		System.out.println("视频文件："+name+",杀！");
		
	}
}

class Folder implements AbstractFile{
	public Folder(String name) {
		super();
		this.name = name;
	}
	private String name;
	
	//定义容器，用来存放子节点
	private List<AbstractFile> list = new ArrayList<>();
	
	public void add(AbstractFile abstractFile){
		list.add(abstractFile);
	}
	public void remove(AbstractFile abstractFile){
		list.remove(abstractFile);
	}
	public AbstractFile getChid(int index){
		return list.get(index);
	}
	@Override
	public void killVirus() {
		System.out.println("文件夹："+name+",杀！");
		for (AbstractFile abstractFile : list) {
			abstractFile.killVirus();
		}
	}
}