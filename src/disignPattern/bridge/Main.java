package disignPattern.bridge;

public class Main {

	public static void main(String[] args) {
		ConnectBridge bridge=new MysqlBridge();
		
		MysqlConnector mysqlConnect=new MysqlConnector();
		bridge.setConnectorInterface(mysqlConnect);
		bridge.connector();
		
		OracleConnector oraceConnect=new OracleConnector();
		bridge.setConnectorInterface(oraceConnect);
		bridge.connector();
	}

}
