package designPattern.factory;

import java.util.ArrayList;
import java.util.List;

public class Builder {

	private List<CheckInInterFace> checkInList=new ArrayList<>();
	
	//建造者
	public void getReceptionList(int count)
	{
		for(int i=0;i<count;i++)
		{
			Provider provider=new ReceptionAbstractFactory();
			checkInList.add(provider.getCheckInType());
		}
	}
	
	public void getBookList(int count)
	{
		for(int i=0;i<count;i++)
		{
			Provider provider=new BookAbstractFactory();
			checkInList.add(provider.getCheckInType());
		}
	}
	
	public List<CheckInInterFace> getList()
	{
		return checkInList;
	}
}
