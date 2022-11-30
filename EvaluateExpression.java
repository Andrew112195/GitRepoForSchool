/**
 * Assignment 2
 * Andrew Shapiro
 * implements created Node and MyLinkedStack classes
 */

import java.util.Scanner;

public class EvaluateExpression<E> {

	/**
	 * Method for receiving the new operand after operation.
	 * @param opX 
	 * @param opY
	 * @param operator is used for switch case
	 * @return
	 */
	public static int evaluateThis(int opX, int opY, char operator) {
		switch (operator) {
			case '*':
				opY *= opX;
				break;
			
			case '/':
				opY = opX / opY;
				break;
			
			case '+':
				opY += opX;
				break;
			
			case '-':
				opY = opX - opY;
				break;
		}
		
		return opY;
	}
	
	public static void main(String[] args) {
		
		MyLinkedStack<Integer> operands = new MyLinkedStack<Integer>();
		MyLinkedStack<Character> operators = new MyLinkedStack<Character>();
		int opX, opY;
		char operator;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the expression to evaluate");
		
		String expression = input.nextLine();
		
		
		for(int i = 0; i < expression.length(); i++) {
			if(Character.isDigit(expression.charAt(i))) {
				//checks for operand
				operands.push(Character.getNumericValue(expression.charAt(i)));
			}
			else if(expression.charAt(i) == ' ') {
				//do nothing
			}
			//check for addition or subtraction
			else if(expression.charAt(i) == '+' || expression.charAt(i) == '-') {
				//loops to process all operations before add or subtract// only executes if there are operations before add
				while(operators.sizeOf() > 0 && operands.sizeOf() > 1) {
					opY = operands.pop();
					opX = operands.pop();
					operator = operators.pop();
					operands.push(evaluateThis(opX, opY, operator));
				}
				//pushes operation after loop condition is met
				operators.push(expression.charAt(i));
			}
			
			//checks for mult or divide
			else if(expression.charAt(i) == '*' || expression.charAt(i) == '/') {
				//if no mult or divide on top of stack adds operation
				if(operators.peek() == null || operators.peek() == '(') {
					operators.push(expression.charAt(i));
				}
				//if mult or divide are on top of stack performs operation and adds afterwards
				else if (operators.peek() == '*' || operators.peek() == '/'){
					opY = operands.pop();
					opX = operands.pop();
					operator = operators.pop();
					operands.push(evaluateThis(opX, opY, operator));
					operators.push(expression.charAt(i));
				}
			}
			//check for parenthesis
			else if(expression.charAt(i) == '(') {
				operators.push(expression.charAt(i));
			}
			//loops performing operations inside parenthesis
			else if(expression.charAt(i) == ')') {
					while (operators.peek() != '(') {
							opY = operands.pop();
							opX = operands.pop();
							operator = operators.pop();
							operands.push(evaluateThis(opX, opY, operator));
					}
					//pops opening parenthesis
					operators.pop();
				}
			//to handle remaining operations loops to completion
			 if(expression.length() - 1 == i) {
				while(operators.isEmpty() == false) {
					opY = operands.pop();
					opX = operands.pop();
					operator = operators.pop();
					operands.push(evaluateThis(opX, opY, operator));
				}
			}
		}
		//output for both stacks formatted to string
		System.out.println(operands.toString() + operators.toString());
		input.close();
		}
	
}
