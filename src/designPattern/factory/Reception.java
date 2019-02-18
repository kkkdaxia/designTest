package designPattern.factory;

public class Reception implements CheckInInterFace {

	@Override
	public void setInfo() {
		System.out.println("前台入住");
	}

}
