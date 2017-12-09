package io.jsd.training.java.algorithms.practice.stringofcharacters.parenthesesbalanced;

import java.util.Stack;

public class Parenthesis {
	
	private Stack<String> charStack;
	private static final String BRACES ="{}";
	private static final String BRACKETS ="[]";
	private static final String PARENTHESES ="()";
	
	public boolean isBalanced(String isBalenced){
		charStack = new Stack<String>();
//		System.out.println(isBalenced.length());
		for(int i=0; i<isBalenced.length(); i++){
			String current = isBalenced.substring(i, i+1);
//			System.out.println("current avant if  "+current);
				if(current.equals("{") || current.equals("[") || current.equals("(")){
					charStack.push(current);
//					System.out.println("current "+current);
				} else if(current.equals("}") || current.equals("]") || current.equals(")")){ {
					String couple = "";
					if(!charStack.isEmpty()){
						couple = charStack.peek()+current;
					}
//					System.out.println("couple "+couple);
					if(charStack.isEmpty() || (!couple.equals(BRACES) && !couple.equals(BRACKETS) && !couple.equals(PARENTHESES) ) ){
						return false;
					} else {
						charStack.pop();
					}
					
				}
			}
		}
		return charStack.isEmpty()? true : false;
	}

}
