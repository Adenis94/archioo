
public class Operator {
	
	private static Operator ope;

	public static int execute(int x, int y, char op) {
		op=CalculatorConfig.getOperator(ope);
		return op.execute(x, y);
	}

	public int addition(int x, int y) {
		return 0;
	}

	public int division(int x, int y) {
		return 0;
	}
	

}
