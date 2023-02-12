package com.gllearning.lab3.problem1;

import java.util.Stack;

public class BalancedBrackets {
	private Stack<Character> stack;

	public BalancedBrackets() {
		super();
		this.stack = new Stack<Character>();
	}

	public boolean isBalancedBrackets(String expression) {
		if (expression == null || expression.isEmpty() || expression.length() % 2 != 0) {
			return false;
		}
		this.stack.clear();
		for (int i = 0; i < expression.length(); i++) {
			char character = expression.charAt(i);
			if (!"[{()}]".contains(String.valueOf(character))) {
				return false;
			}
			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char checkCharacter;
			switch (character) {
			case ')':
				checkCharacter = stack.pop();
				if (checkCharacter != '(')
					return false;
				break;

			case '}':
				checkCharacter = stack.pop();
				if (checkCharacter != '{')
					return false;
				break;

			case ']':
				checkCharacter = stack.pop();
				if (checkCharacter != '[')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
}
