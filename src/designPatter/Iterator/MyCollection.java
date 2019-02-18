package designPatter.Iterator;

public class MyCollection implements Collection {

	private Object[] myObject={"你好","再见"};
	
	
	@Override
	public int size() {
		return myObject.length;
	}

	@Override
	public Object get(int i) {
		return myObject[i];
	}

	@Override
	public boolean remove(int i) {
		try {
			for(int count=0;count<myObject.length;count++){
				if(count==i)
					myObject[i]=null;
				if(count>=i)
					myObject[count-1]=myObject[count];
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Iterator iterator() {
		return new MyIterator(this);
	}

	@Override
	public void add(Object element) {
		myObject[myObject.length]=element;
	}

}
