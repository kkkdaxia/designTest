package designPatter.strategy;

import java.math.BigDecimal;

public class Add implements CalculatInterface {

	@Override
	public BigDecimal calculate(String exp) {
		String[] expList=exp.split("\\+");
		BigDecimal reM=new BigDecimal(0);
		for(String expC:expList)
		{
			reM=reM.add(new BigDecimal(expC));
		}
		return reM;
	}

}
