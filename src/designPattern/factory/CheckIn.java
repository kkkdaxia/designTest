package designPattern.factory;

import java.io.Serializable;

public class CheckIn implements Serializable {

	public static void main(String[] args) {
		//单工厂
		CheckInFactory factory=new CheckInFactory();
		CheckInInterFace check=factory.checkIn("reception");
		check.setInfo();
		//多工厂
		CheckInFactory factory1=new CheckInFactory();
		factory1.receptionCheckIn().setInfo();
		//静态工厂
		CheckInFactory.staticBookCheckIn().setInfo();
		
		//抽象工厂
		Provider provider=new ReceptionAbstractFactory();
		CheckInInterFace factory3= provider.getCheckInType();
		factory3.setInfo();
		
		//建造者模式
		Builder builder=new Builder();
		builder.getReceptionList(10);
		for(int i=0;i<builder.getList().size();i++)
			builder.getList().get(i).setInfo();
	}

}
