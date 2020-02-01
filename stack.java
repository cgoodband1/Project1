/**
 * 
 * @author <Chase Goodband>
 * @version<10/04/2019>
 *
 */

public class stack {
		private int maxSize;  //size of stack array
		private country[] stackArray;
		private int top;  // top of array
		
		public stack(int s)                   //constructor
		{
			maxSize = s;                    // set array size
			stackArray = new country[maxSize];   //create array
			top = -1;                         // no items yet
		}
		
		public void push(country j)              // put item on top of stack
		{
			stackArray[++top] = j;            // increment top, insert item 
		}
		
		public country pop()                     // take item from top of stack 
		{
			return stackArray[top--];         //access item, decrement top
		}
		
		public void printStack()
		{
//			for(country element: stackArray ) {
//				System.out.println(element);
//			}
			
			for (int i = 0; i < top; i++) {
				stackArray[i].print();
			}
		}
		
		public boolean isEmpty()              // true if stack is empty 
		{
			return (top == -1);
		}
		
		
		public boolean isFull()               // true if stack is full
		{
			return (top == maxSize-1);
		}
		
		
		

	}
