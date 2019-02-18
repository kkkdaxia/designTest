package designPattern.factory;

public class ReceptionAbstractFactory implements Provider {

	@Override
	public CheckInInterFace getCheckInType() {
		return new Reception();
	}
}
