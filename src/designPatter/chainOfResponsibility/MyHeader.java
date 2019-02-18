package designPatter.chainOfResponsibility;

public class MyHeader extends AbstactHeader implements Header {

	private String name;
	
	public MyHeader(String name)
	{
		this.name=name;
	}
	
	@Override
	public void operator() {
		System.out.println("myNameIs:"+name);
		if(getHandler()!=null)
			getHandler().operator();
	}
}
