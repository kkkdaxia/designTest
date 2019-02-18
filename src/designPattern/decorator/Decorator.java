package designPattern.decorator;

public class Decorator implements BaseInterface {

	private BaseInterface source;
	
	//装饰模式需要传入原方法
	public Decorator(BaseInterface source) {
		super();
		this.source=source;
	}
	
	//代理模式更关注与新增加的方法，在默认构造方法中实现原方法
	public Decorator() {
		super();
		this.source=new Source();
	}
	
	@Override
	public void Money() {
		System.out.println("before Decorator");
		source.Money();
		System.out.println("after Decorator");
	}

} 
