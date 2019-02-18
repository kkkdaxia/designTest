package lambda;

public class LambdaTest {

	public static void main(String[] args) {
		IMathListener mathListener=(start,plusValue)->start + plusValue;
		System.out.println(mathListener.doMathOperator(1, 2));
		
		IMathListener math1=Math::doIntPlus;
		System.out.println(math1.doMathOperator(1, 2));
		
	}


}
