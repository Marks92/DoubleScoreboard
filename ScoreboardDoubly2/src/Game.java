/* Mark Schuberth
 * Professor Abdollahzadeh
 * CS 253 - 70
 * Implementation of Doubly Linked List that creates a 
 * Video Game High scores lists. It then removes the 
 * lowest score when the list gets over 10 scores.
 * 9/24/2018
 */


//Game class that prints the top scores and implements add, remove, and
//print methods from DoublyLinkedList class
public class Game 
{
	public static void main(String[] args) 
	{
		System.out.println("Top scores using Doubly Linked list!");
		System.out.println("______________________________");
		System.out.println();
		
		DoublyLinkedList Double = new DoublyLinkedList();
		
		Double.add(350);		//element 1
		Double.add(400);		//element 2
		Double.add(450);		//element 3
		Double.add(200);		//element 4
		Double.add(175);		//element 5
		Double.add(500);		//element 6
		Double.add(150);		//element 7
		Double.add(600);		//element 8
		Double.add(125);		//element 9
		Double.add(100);		//element 10 lowest element to be removed
		Double.add(700);		//element 11
		Double.print();
		System.out.println("\nThe number of high scores is: " + Double.getSize() + "\n");
		System.out.println("Too many scores in the list! Removing lowest element!\n");
		Double.remove(11); //position 10?
		Double.print();
		System.out.println("\nThe number of high scores is: " + Double.getSize());
	}
}
