package designPattern.factory;

public class BookAbstractFactory implements Provider {

	@Override
	public CheckInInterFace getCheckInType() {
		return new Book();
	}
}
