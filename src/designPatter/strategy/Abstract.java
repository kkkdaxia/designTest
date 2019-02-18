package designPatter.strategy;

import java.math.BigDecimal;

public class Abstract implements CalculatInterface {

	@Override
	public BigDecimal calculate(String exp) {
		String[] expList=exp.split("\\-");
		BigDecimal reM=new BigDecimal(0);
		for(String expC:expList)
		{
			reM=reM.subtract(new BigDecimal(expC));
		}
		return reM;
	}
}
