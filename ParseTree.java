
public class ParseTree {
	private Node root;
	private boolean addTo;
	
	public ParseTree() {
		root = null;
	}
	
	
	
	public void add(Node n) {
		if (root == null) {
			root = n;
			n.setParent(root);
		} else {
			root = null;
		}
	}
}
