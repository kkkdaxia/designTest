package disignPattern.bridge;

public class MysqlBridge extends ConnectBridge {

	public void connect()
	{
		getConnectorInterface().connect();
	}
}
