/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of Doubly Linked List that creates a 
 * Video Game High scores lists. It then removes the 
 * lowest score when the list gets over 10 scores.
 * 9/24/2018
 */

//DoublyLinkedList class that creates add, remove, print, and getSize methods
//which are used later on in the main class Game
public class DoublyLinkedList 
{
	private Node head;
	private int size;
	
	//constructor for the Doubly Linked List
	public DoublyLinkedList()
	{
		head = null;
		size = 0;
	}
	
	/* add method that will add an integer based on the size of the list
	 * ass well as move the integer to the correct part of the list based
	 * on its value */
	public void add(int data)
	{
		Node newnode = new Node(null, data, null);
		Node temp, p;
		
		boolean insert = false;
		
		//if the list is empty the first element will be the head
		if(head == null)
		{
			head = newnode;
		}
		//if the new node is greater than the head it will now become
		//the head node and the old head will move back
		else if(data >= head.getData())
		{
			newnode.setNodeNext(head);
			head.setNodePrev(newnode);
			head = newnode;
		}
		//if the new node is less than the head node it will move back
		//and then be compared to the rest of the nodes (if any others exist)
		else
		{
			temp = head;
			p = head.getNodeNext();
			while(p != null)
			{
				//this test whether the new node data is greater than or less
				//than other nodes in the list
				if(data <= temp.getData() && data >= p.getData())
				{
					temp.setNodeNext(newnode);
					newnode.setNodePrev(temp);
					newnode.setNodeNext(p);
					p.setNodePrev(newnode);
					insert = true;
					break;
				}
				else
				{
					temp = p;
					p = p.getNodeNext();
				}
			}
			//if the new node data is the lowest data it moves to the end of the list (tailer)
			if(!insert)
			{
				temp.setNodeNext(newnode);
				newnode.setNodePrev(temp);
			}
		}
		size++;
	}
	
	//this method removes a node based on it's index in the list
	public void remove(int position)
	{
		//if 1 is used as the index it will delete the head node
		if(position == 1)
		{
			//if that head node is the only node in the list
			//the list is now 0 or empty
			if(size == 1)
			{
				head = null;
				size = 0;
				return;
			}
			//if the head node is removed the next node is now the head node
			//the list is now 1 node smaller
			head = head.getNodeNext();
			head.setNodePrev(null);
			size--;
			return;
		}
		//deletes the node at the end of the list
		if(position == size)
		{
			Node p = head;
			
			for(int i = 1; i < size - 1; i++)
			{
				p = p.getNodeNext();
			}
			p.setNodeNext(null);
			size--;
			return;
		}
		
		Node p = head.getNodeNext();
		
		//deletes a node in the middle of the list based on its position
		for(int i = 2; i <= size; i++)
		{
			if(i == position)
			{
				Node prev = p.getNodePrev();
				Node next = p.getNodeNext();
				
				prev.setNodeNext(next);
				next.setNodePrev(prev);
				size--;
				return;
			}
			p = p.getNodeNext();
		}
	}
	
	//prints the list of nodes in the Doubly linked list
	public void print()
	{
		//if the list is empty we will return no scores!
		if(size == 0)
		{
			System.out.println("No scores!\n");
			return;
		}
		//if the head Node is the only element we will return the head element
		if(head.getNodeNext() == null)
		{
			System.out.println(head.getData());
			return;
		}
		
		Node p = head;
		System.out.println(head.getData() + " ");
		p = head.getNodeNext();
		//prints out the entire list of the nodes
		while(p.getNodeNext() != null)
		{
			System.out.println(p.getData() + " ");
			p = p.getNodeNext();
		}
		//prints the next node on the next line
		System.out.print(p.getData() + "\n");
	}
	
	//returns the size of the list
	public int getSize()
	{
		return size;
	}
		
	//tests if the list is empty by testing whether the head is null
	public boolean isEmpty()
	{
		return head == null;
	}

}
