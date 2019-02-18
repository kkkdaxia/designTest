package designPatter.Iterator;

public interface Collection {

	public int size();
	
	public Object get(int i);
	
	public boolean remove(int i);
	
	public void add(Object element);
	
	public Iterator iterator();
}
