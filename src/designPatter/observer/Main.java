package designPatter.observer;

public class Main {

	public static void main(String[] args) {
		AbstractSend send=new SendBase();
		ReceiveInterface receive1=new Receive1();
		send.add(receive1);
		ReceiveInterface receive2=new Receive1();
		send.add(receive2);
		send.otherOption();
		send.sendMessage("滴滴");
	}
}
