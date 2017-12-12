/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {

	// Set up the basic elements of your data structure here.
	
	/*
	 * This is the constructor for the Stack class.  Notice
	 * there is one integer parameter (the size of the stack).
	 */
	 
	private String[] array;
	private int size;
	
	public Stack(int size) {
		String[] arr = new String[size];
		array = arr;
		this.size = size;
		// Your code here
	}

	public boolean push(String record) {
		int count = 0;
		int num = 0;
		boolean lo = false;
		while (count == 0 && num < size) {
			if (array[num] == null) {
				array[num] = record;
				count ++;
				lo = true;
			} else {
				num ++;
			}
		}
		if (count == 0 && num == size) {
			lo = false;
		}
		return lo;
	}

	public String pop() {
		int count = 0;
		int num = size - 1;
		String temp = "";
		while (count == 0 && num >= 0) {
			if (array[num] != null) {
				temp = array[num];
				array[num] = null;
				count ++;				
			} else {
				num --;
			}
		}
		return temp;
	}

	public void printStack() {
		for (int i = size - 1; i >= 0; i --) {
			if (array[i] != null) {
				System.out.println(array[i]);
			}
			
		}
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Implement the other methods specified
	 * in the interface below.
	 */
	
}
