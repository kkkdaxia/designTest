package designPatter.observer;

import java.util.Vector;

public abstract class AbstractSend implements SendOutInterface {

	private Vector<ReceiveInterface> recevierVertor=new Vector<ReceiveInterface>();
	
	@Override
	public void add(ReceiveInterface receiver) {
		recevierVertor.add(receiver);
	}

	@Override
	public void delete(ReceiveInterface receiver) {
		recevierVertor.remove(receiver);
	}

	@Override
	public void sendMessage(String msg) {
		for(ReceiveInterface ri:recevierVertor)
		{
			ri.getMessage(msg);
		}
	}

	@Override
	public abstract void otherOption() ;


}
