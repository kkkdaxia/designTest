package designPattern.adapter;


public class MoneyAdapter implements Targetable {


	private Source source;  
	
	public MoneyAdapter()
	{
		super();
		source=new Source();
	}
	
	@Override
	public void checkOutMoney() {
		System.out.println("checkOutMoney");
	}

	@Override
	public void saveMoney() {
		source.saveMoney();
	}

	
}
