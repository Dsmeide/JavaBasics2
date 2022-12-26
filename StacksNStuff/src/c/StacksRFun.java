package c;

import java.util.Stack;

public class StacksRFun {

	public static void main(String[] args) {
		//like a stack of video games.  to get the one you want you need to take from the top
		
		Stack<String> games = new Stack<String>();
		
		games.add("Call of Duty");
		games.add("guitar hero");
		games.add("super monkey ball");
		
		System.out.println(games.pop());
		System.out.println(games.peek());
		System.out.println(games);
		
		//Y
		//B
		//R
		
		Stack<Character> tower = new Stack<Character>();
		
		tower.add('R');
		tower.add('B');
		tower.add('Y');
		
		System.out.println(tower);
		System.out.println(tower.get(0));
		//add, pop, get, size
	}

}
