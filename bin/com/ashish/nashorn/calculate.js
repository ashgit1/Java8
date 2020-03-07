/**
 * script to call java from javascript
 */

var BigDecimal = Java.type('java.math.BigDecimal');

var result = calculate(750, 87.06);

print(result);

function calculate(amount, percentage) {
	
	var result = new BigDecimal(amount).multiply(new BigDecimal(percentage)).
				divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_EVEN);
	
	return result.toPlainString();
}