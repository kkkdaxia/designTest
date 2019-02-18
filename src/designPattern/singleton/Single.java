package designPattern.singleton;

import java.io.Serializable;

public class Single implements Serializable  {


	
	private int count=0;
	
	private Single()
	{
		System.out.println("new");
		count++;
	}
	
	private static class SingleFactory
	{
		private static Single mysingle=new Single();
	}
	
	public static Single getSingle()
	{
		return SingleFactory.mysingle;
	}

	public void getCount()
	{
		System.out.println(count);
	}
	
}
