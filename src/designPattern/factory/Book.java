package designPattern.factory;

public class Book implements CheckInInterFace {

	@Override
	public void setInfo() {
		System.out.println("预定入住");
	}

}
