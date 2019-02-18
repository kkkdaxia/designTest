package designPatter.strategy;

public class Main {

	public static void main(String[] args) {
		CalculatInterface add=new Add();
		System.out.println(add.calculate("1+2"));
		CalculatInterface substract=new Abstract();
		System.out.println(substract.calculate("9-3"));
	}

}
