package designPattern.singleton;

public class Main {

	public static void main(String[] args) {
		Single s=Single.getSingle();
		for(int i=0;i<5;i++)
			s.getCount();
	}

}
