package designPatter.observer;

public interface SendOutInterface {

	void add(ReceiveInterface receiver);
	
	void delete(ReceiveInterface receiver);
	
	void otherOption();

	void sendMessage(String msg);
}
