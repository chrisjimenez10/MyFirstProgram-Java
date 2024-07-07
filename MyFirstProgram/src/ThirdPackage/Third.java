package ThirdPackage;

//ArrayList Class and List Interface are part of the "java.util" package --> NOTE: We need to import them, so we can use them
import java.util.*;


public class Third {
	
	 public static void fullyQualifiedName() {
		 System.out.println("Yo, I am fully qualified!");
	 }
	 


	public static void main(String[] args) {
		
		//Array List: It is part of the collections framework and provides us with dynamic arrays in Java - It is slower than standard arrays, but it's helpful when we need to do a lot of manipulation to the array (insertion, removal, searching, sorting, etc.)
		ArrayList<String> al = new ArrayList<String>();
		al.add("Chris");
		al.add("Wendy");
		al.add("Ashi");
		al.add("Bipin");
		
		//The add() ArrayList method takes two parameters: 1.Index Position in the list to insert element, 2.Element to be inserted
		al.add(0, "Stephanie");
		al.add("Stephanie");
		
		//The remove() method removes an element either by 1.Index position (using an integer value), 2.Object name (It deletes the FIRST occurrence of the object - which means that if there are duplicates, it only deletes the first one it encounters)
		al.remove("Stephanie");
		System.out.println("Elements in ArrayList: " + "\n\t" + al);
		
		//The get() method retrieves an object element from the ArrayList by index position
		String name = al.get(4);
		System.out.println("I used the get() method to get: " + name);
		
		//The set() method replaces an element at the index position with another element we give it
		String replacingElement = al.set(0, "I replaced you");
		System.out.println(al);
		
		ArrayList<Integer> el = new ArrayList<Integer>();
		el.add(1);
		el.add(2);
		el.add(3);
		el.remove(0);
		
		//The size() method returns the number of elements in the list --> NOTE: It does not take an argument
		System.out.println(el.size());
		
		//The clear() method REMOVES all of the elements from the list
//		el.clear();
		System.out.println(el);
		
		//ArrayList vs LinkedList: ArrayList = Underlying data structure that uses dynamic array to store elements (Access = O(1) - Insertion/Deletion = O(n) if elements need to be shifted) - Less memory usage (Better space complexity) --> LinkedList = Underlying data structure uses a doubly linked list to store elements (Access = O(n) because it requires to traverse from head or tail of the list to the desired index - Insertion/Deletion = O(1) for beginning, end, or with iterator and O(N) if inserting/removing at a given index - More memory usage --> When to use one over the other? When we need fast random access to elements using indices and more read operations and size of list stays relatively stable = ArrayList ** When we need frequent insertions and deletions especially at beginning or end of list and not so many read operations = LinkedList
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("One");
		linkedList.add("Two");
		System.out.println("My LinkedList is: " + linkedList);
		
	}
	
}
