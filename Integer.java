
public class Integer extends Operator {
	private int num1;
	
	public Integer(int num) {
		num1 = num;
	}
	
	public Integer() {
		this(-1);
	}
	
	public int Operate() {
		return num1;
	}
	public int getOrder() {
		return -1;
	}
}
