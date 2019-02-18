package disignPattern.bridge;

public class OracleConnector implements ConnectorInterface {

	@Override
	public void connect() {
		System.out.println("oracle connector");
	}

}
