package designPattern.factory;

public class CheckInFactory {


	//工厂方法
	public CheckInInterFace checkIn(String type)
	{
		if(type.equals("reception"))
			return new Reception();
		if(type.equals("book"))
			return new Book();
		return null;
	}
	
	//多工厂方法
	public CheckInInterFace receptionCheckIn()
	{
		return new Reception();
	}
	
	//静态工厂
	public static CheckInInterFace staticBookCheckIn()
	{
		return new Book();
	}
}
