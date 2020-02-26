
// BinTree is a Generic Class. This means that when you make a new BinTree object, you must
// pass a type parameter to your constructor method call. You do this when you make new ArrayLists
//
// ArrayList<Integer> list = new ArrayList<>(); <- Integer is the type parameter here.
// BinTree<Integer> tree = new BinTree<>(); <- Integer is the type parameter here.
//
// In this skeleton code, the type parameter variable name is "Anytype". When you pass an object
// type as a type parameter to your contructor, all of the "Anytype" objects in this class become
// the type you sent as a parameter. So if we make some BinTree objects:
//
// BinTree<Integer> tree = new BinTree<>(); <- here "Anytype" gets replaced with Integer
// BinTree<String> tree = new BinTree<>(); <- here "Anytype" gets replaced with String
// BinTree<HashMap<Integer, String>> tree = new BinTree<>(); <- here "Anytype" gets replaced with HashMap<Integer, String>
//
// You can name the type variable anything you want. Many generic classes use the type variable
// name "T" like you see in the assignment PDF, but "Anytype" works too.

public class BinTree<Anytype> // <- Notice the type parameter variable name is defined here
{
	private BinTreeNode<Anytype> root;

	// Returns the root of this tree
	public BinTreeNode<Anytype> getRoot()
	{
		if( this.root == null)
			return null;
		
		return root;
	}

	// Takes a BinTreeNode of the same type parameterization as this tree and makes 
	// the node the root of the tree.
	public void setRoot(BinTreeNode<Anytype> root)
	{
		this.root = root;
	}


	public Boolean isBalanced()
	{
		if ( this.root == null)
			return true;
		int result = root.findRootHeight(root);
		if(result == 1)
			return true;
		else 
			return false;
	}
	
	
	
}
