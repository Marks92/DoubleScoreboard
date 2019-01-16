/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of Doubly Linked List that creates a 
 * Video Game High scores lists. It then removes the 
 * lowest score when the list gets over 10 scores.
 * 9/24/2018
 */


//Node class that sets up the Node variables as well as the constructors
//used later on in the DoublyLinkedList class for add and remove methods
public class Node 
{
	private int data;
	public Node previous;
	public Node next;
	
	
	//constructor for Node
	public Node()
	{
		previous = null;
		this.data = 0;
		next = null;
	}
	
	//constructor for Node variables
	public Node(Node previous, int data, Node next)
	{
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	
	//sets the data of the node to an integer value
	public void setData(int d)
	{
		data = d;
	}
	
	//gets the data from the Node which is an int
	public int getData()
	{
		return data;
	}
	
	//sets the Node next Node variable to connect them together
	public void setNodeNext(Node n)
	{
		next = n;
	}
	
	//sets the previous Node to the current Node
	public void setNodePrev(Node p)
	{
		previous = p;
	}
	
	//gets the next Node
	public Node getNodeNext()
	{
		return next;
	}
	
	//gets the previous Node
	public Node getNodePrev()
	{
		return previous;
	}
}