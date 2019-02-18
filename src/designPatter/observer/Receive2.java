package designPatter.observer;

public class Receive2 implements ReceiveInterface {

	@Override
	public void getMessage(String msg) {
		System.out.println("Receive2收到~"+msg);
	}
}
