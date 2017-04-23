package gpj.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的聚合类
 * @author gpj
 *
 */
public class ConcreteMyAggregate {

	public List<Object> list = new ArrayList<>();
	
	public void addObject(Object obj){
		this.list.add(obj);
	}
	public void removeObject(Object obj){
		this.list.remove(obj);
	}
	public List<Object> getList(){
		return list;
	}
	public void setList(List<Object> list){
		this.list = list;
	}
	
	//获得迭代器
	public MyIterator createIterator(){
		return new ConcreteIterator();
	}
	//使用内部类定义迭代器，可以直接使用外部类的属性
	private class ConcreteIterator implements MyIterator{

		private int cursor;		//定义游标用于记录遍历时的位置
		@Override
		public void first() {
			cursor=0;
		}

		@Override
		public void next() {
			if(hasNext())
				cursor++;
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size())
				return true;
			else
				return false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1)?true:false;
		}

		@Override
		public Object grtCurrentObj() {
			return list.get(cursor);
		}
		
	}
}
