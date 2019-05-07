
public class Operator {
	
	protected Operator ope;
	
	
	public Operator getOperator(String ope) {
		if (ope.equals('+')) {
			return new Addition();
		}
		else if (ope.equals('/')) {
			return new Division();
		}
		return null;
	}
	

}
