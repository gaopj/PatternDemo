package gpj.iterator;

public class Client {

	public static void main(String[] args) {
		ConcreteMyAggregate cma = new ConcreteMyAggregate();
		cma.addObject("a");
		cma.addObject("b");
		cma.addObject("2");
		cma.addObject("e");
		
		MyIterator iterator = cma.createIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.grtCurrentObj());
			iterator.next();
		}

	}

}
