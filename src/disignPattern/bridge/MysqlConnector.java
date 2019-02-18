package disignPattern.bridge;

public class MysqlConnector implements ConnectorInterface {

	@Override
	public void connect() {
		System.out.println("mysql connect");
	}

	
}
