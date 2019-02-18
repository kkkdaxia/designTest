package designPatter.template;

import java.math.BigDecimal;

public class Add extends CalculateTemplate {

	@Override
	public BigDecimal calculate(BigDecimal m1, BigDecimal m2) {
		return m1.add(m2);
	}

}
