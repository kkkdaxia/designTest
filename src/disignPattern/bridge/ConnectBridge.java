package disignPattern.bridge;

public class ConnectBridge {

	private ConnectorInterface connectorInterface;

	public void connector()
	{
		connectorInterface.connect();
	}
	
	public ConnectorInterface getConnectorInterface() {
		return connectorInterface;
	}

	public void setConnectorInterface(ConnectorInterface connectorInterface) {
		this.connectorInterface = connectorInterface;
	}
	
	
}
