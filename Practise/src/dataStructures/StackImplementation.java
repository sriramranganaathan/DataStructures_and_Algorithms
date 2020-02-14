package dataStructures;

import java.util.Stack;

public class StackImplementation {
	
	public static void main(String args[]){
		Stack<String> names = new Stack<String>();
		names.push("Raj");
		names.push("Mike");
		names.push("Steve");
		
		System.out.println(names);
		
		names.pop();
		System.out.println(names);
		
		System.out.println(names.search("Mike"));
		
		System.out.println(names.peek());
	}

}
