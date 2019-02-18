package designPattern.decorator;

public class Main {

	public static void main(String[] args) {
		BaseInterface source = new Source();  
		Decorator decorator=new Decorator(source);
		decorator.Money();
	}

}
