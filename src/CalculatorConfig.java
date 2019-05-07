import java.util.HashMap;
import java.util.Map;

public class CalculatorConfig {
	private Operator oper;
	
	static Map<Character, Operator> mapOp = new HashMap<Character, Operator>();
	
	public static Operator getOperator(char oper) {
		init();
		return mapOp.get(oper);
		
	}
	
	public static void init() {
		mapOp.put('+', new Addition());
		mapOp.put('/', new Division());
	}
	
}
