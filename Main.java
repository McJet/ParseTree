import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ParseTree tree;
		String problem = "3+5*16/2^2-6";
		ArrayList<Operator> OperatorList = new ArrayList<Operator>();
		ArrayList<Node> NodeList = new ArrayList<Node>();
		
		//takes the problem and converts every character into
		//an operator and then places them in the operator list
		for (int i = 0; i < problem.length(); i++)
		{
			System.out.println("success.");
			switch(problem.charAt(i)) {
			case '+':
				OperatorList.add(new Plus());
				break;
			case '-':
				OperatorList.add(new Minus());
				break;
			case '*':
				OperatorList.add(new Multiply());
				break;
			case '/':
				OperatorList.add(new Divide());
				break;
			case '^':
				OperatorList.add(new Power());
				break;
			default:
				//checks if the integer has two digits and combines it into one operator
				if (OperatorList != null && OperatorList.get(OperatorList.size())) {
					int num = OperatorList.remove(i-1).Operate();
					num *= 10;
					OperatorList.add(new Integer((int) problem.charAt(i) + num));
				} else {
					OperatorList.add(new Integer((int) problem.charAt(i)));
				}
			}
		}
		
		//places each operator into their own node and
		//puts it into a node list
		for (int i = 0; i < OperatorList.size(); i++) {
			System.out.println(OperatorList.get(i));
			NodeList.add(new Node(OperatorList.get(i)));
		}

	}

}
