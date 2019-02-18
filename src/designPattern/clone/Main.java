package designPattern.clone;

public class Main {

	public static void main(String[] args) throws Exception {
		Clone clone1=new Clone();
		Clone clone2=clone1.clone();
		Clone clone3=clone1.deepClone();
		
	}

}
