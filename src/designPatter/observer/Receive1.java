package designPatter.observer;

public class Receive1 implements ReceiveInterface {

	@Override
	public void getMessage(String msg) {
		System.out.println("Receive1收到~"+msg);
	}
}
