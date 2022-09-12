import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 
 * @author johnpaulthomas
 * A class of stacks whose entries are stored as an array
 * 
 */
public final class ArrayStack<T> implements StackInterface<T>{

	/**
	 * array of stack entries
	 */
	private T[] stack;
	
	/**
	 * Index of top entry in stack
	 */
	private int topIndex;
	
	private boolean integrityOk;
	
	private static final int DEFAULT_CAPACITY = 1;
	
	private static final int MAX_CAPACITY = 1000;
	
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}//end empty argument constructor
	
	public ArrayStack(int initialCapacity) {
		integrityOk = false;
		checkCapacity(initialCapacity);
		
		@SuppressWarnings("unchecked")
		T[] tempStack = (T[]) new Object[initialCapacity];
		
		stack = tempStack;
		topIndex = -1;
		integrityOk = true;
		
	}//end preferred constructor
	/**
	 * throws an exceptions if the user input is too large for capacity
	 * 
	 */

	@Override
	public void push(T newEntry) {
		checkIntegrity();
		ensureCapacity();
		stack[topIndex + 1 ] = newEntry;
		topIndex++;
	}//end push

	@Override
	public T pop() {
		checkIntegrity();
		if (isEmpty())
			throw new EmptyStackException();
		else {
			T top = stack [topIndex];
			stack[topIndex] = null;
			topIndex--;
			return top;
		}//end if 
	}//end pop 

	@Override
	public T peek() {
		checkIntegrity();
		if (isEmpty())
			throw new EmptyStackException();
		else 
		return stack[topIndex];
	}//end peek

	@Override
	public boolean isEmpty() {
		
		return topIndex < 0;
	}//end isEmpty

	@Override
	public void clear() {
		while (!isEmpty())
			pop();
	}//end clear
	
	private void checkCapacity(int capacity) {
		if (capacity > MAX_CAPACITY)
			throw new IllegalStateException("Attempt to create a bag whose capacity exceeds allowed maximum of " +MAX_CAPACITY);
			
	}//end checkCapacity
	
	private void ensureCapacity() {
		if (topIndex == stack.length - 1) {
			int newLength = stack.length +1;
			checkCapacity(newLength);
			stack = Arrays.copyOf(stack, newLength);
			//doubleCapacity();
		}//end if statement
			
	}//end ensureCapacity
	/**
	 * doubles the size of the array bag
	 * call checkIntegrity
	 * 
	 */
	//private void doubleCapacity() {
		//int newLength = 2 * stack.length;
		//checkCapacity(newLength);
		//stack = Arrays.copyOf(stack, newLength);
		
	//}//end doubleCapacity
	public void checkIntegrity() {
		if (!integrityOk)
			throw new SecurityException("Array bag object is corrupt.");
	}// end checkIntegrity
/**
 * toString method set to override so that ArrayStack can be printed as a string 
 * displaying its elements
 */
	
	@Override
	public String toString() {
		return "ArrayStack [stack=" + Arrays.toString(stack) + ", topIndex=" + topIndex + "]";
	}//end toString

}//end class
