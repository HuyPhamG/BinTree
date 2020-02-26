
	// BinTreeNode is a Generic Class. This means that when you make a new BinTreeNode object, you must
	// pass a type parameter to your constructor method call. You do this when you make new ArrayLists
	//
	// ArrayList<Integer> list = new ArrayList<>(); <- Integer is the type parameter here.
	// BinTreeNode<Integer> tree = new BinTreeNode<>(key, data); <- Integer is the type parameter here.
	//
	// In this skeleton code, the type parameter variable name is "Anytype". When you pass an object
	// type as a type parameter to your contructor, all of the "Anytype" objects in this class become
	// the type you sent as a parameter. So if we make some BinTreeNode objects:
	//
	// BinTreeNode<Integer> tree = new BinTreeNode<>(key, data); <- here "Anytype" gets replaced with Integer
	// BinTreeNode<String> tree = new BinTreeNode<>(key, data); <- here "Anytype" gets replaced with String
	// BinTreeNode<HashMap<Integer, String>> tree = new BinTreeNode<>(key, data); <- here "Anytype" gets replaced with HashMap<Integer, String>
	//
	// You can name the type variable anything you want. Many generic classes use the type variable
	// name "T" like you see in the assignment PDF, but "Anytype" works too.

	public class BinTreeNode<Anytype> // <- Notice the type parameter variable name is defined here
	{
		private Anytype key;
		private Object satelliteData;
		private BinTreeNode<Anytype> parent;
		private BinTreeNode<Anytype> leftChild;
		private BinTreeNode<Anytype> rightChild;
		


		// Constructor Method: This method is called when 
		// you write BinTreeNode<Anytype> node = new BinTreeNode<>(key, data);
		public BinTreeNode(Anytype key, Object satelliteData)
		{
			this.key = key;
			this.satelliteData = satelliteData;
			this.parent = null;
			this.leftChild = null;
			this.rightChild = null;
		}

		// Takes a node and makes it this node's left child
		public void addLeftChild(BinTreeNode<Anytype> leftChildNode)
		{
			this.leftChild = leftChildNode;
		}

		// Takes a node and makes it this node's right child
		public void addRightChild(BinTreeNode<Anytype> rightChildNode)
		{
			this.rightChild = rightChildNode;
		}

		// Takes a node and makes it this node's parent
		public void setParent(BinTreeNode<Anytype> parentNode)
		{
			this.parent = parentNode;
		}

		// Returns the parent of this node
		public BinTreeNode<Anytype> getParent()
		{
			
			if (parent == null)
			{
				return null;
			}
			return parent;
		}

		// Returns the left child of this node
		public BinTreeNode<Anytype> getLeftChild()
		{
			if (leftChild == null)
			{
				return null;
			}
			return leftChild;
		}

		// Returns the right child of this node
		public BinTreeNode<Anytype> getRightChild()
		{
			if (rightChild == null)
			{
				return null;
			}
			return rightChild;  
		}
		
		
		public int rootheight(BinTreeNode<Anytype> root) {
			if (root == null)
			{
				return 0;
			}
			return 1 + Math.max(rootheight(root.leftChild), rootheight(root.rightChild));
	}
		
		
		public int findRootHeight(BinTreeNode<Anytype> root){
			int left, right;
			if (root == null)
				return 1;
			//
			left = rootheight(root.leftChild);
			right = rootheight(root.rightChild);
			
			if (Math.abs(left-right) > 1)
				return 0;
			
			findRootHeight(root.leftChild);
			findRootHeight(root.rightChild);
			
			return 1;
			
		}
		

		// To make your life easier
		@Override
		public String toString()
		{
			String keyString;
			String dataString;

			if (this.key == null)
				keyString = "null";
			else
				keyString = this.key.toString();

			if (this.satelliteData == null)
				dataString = "null";
			else
				dataString = this.satelliteData.toString();

			return ("(" + keyString + ", " + dataString + ")");
		}

	

	

}
