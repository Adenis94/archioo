
public class Division extends Operator {
	
	private Object x;
	private Object y;

	public Object getx(int x) {
		return this.x;
	}
	public Object gety(int y) {
		return this.y;
	}
	
	public int division(int x, int y) {
		return x/y;
	}

}
