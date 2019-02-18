package designPatter.template;

import java.math.BigDecimal;

public abstract class CalculateTemplate {

	public final BigDecimal calculateFinal(String S1,String S2)
	{
		return calculate(new BigDecimal(S1),new BigDecimal(S2));
	}
	
	public abstract BigDecimal calculate(BigDecimal m1,BigDecimal m2);
	
}
