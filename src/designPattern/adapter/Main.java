package designPattern.adapter;

public class Main {

	public static void main(String[] args) {
		Targetable checOut=new MoneyAdapter();
		checOut.saveMoney();
		checOut.checkOutMoney();
	}

}
