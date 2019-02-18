package designPatter.Iterator;

public class MyIterator implements Iterator {

	private Collection collection;
	
	private int i=-1;
	
	public MyIterator(Collection collection)
	{
		this.collection=collection;
	}
	
	@Override
	public Object next() {
		i++;
		return collection.get(i);
	}

	@Override
	public Object previous() {
		i--;
		return collection.get(i-1);
	}

	@Override
	public boolean hasNext() {
		if(i==collection.size()-1)
			return false;
		else
			return true;
	}

	@Override
	public Object first() {
		return collection.get(0);
	}

}
