package designPatter.chainOfResponsibility;

public class Main {

	public static void main(String[] args) {  
	        MyHeader h1 = new MyHeader("h1");  
	        MyHeader h2 = new MyHeader("h2");  
	        MyHeader h3 = new MyHeader("h3");  
	  
	        h1.setHandler(h2);  
	        h2.setHandler(h3);  
	  
	        h1.operator();  
	}

}
