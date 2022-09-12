/**
 * 
 * @author johnpaulthomas
 * Interface for stack
 */
public interface StackInterface <T>{

	/**
	 * adds new entry to the top of the stack 
	 * @param newEntry
	 * 
	 */
	public void push (T newEntry);
	
	/**
	 * removes and returns the stacks top entry
	 * @return the object at the top of the stack 
	 * @throws EmpttStackException if the stack is empty before the operation
	 * 
	 */
	public T pop();
	
	/**
	 * Retrieves this stacks top entry 
	 * @return the top of the stack 
	 * @throws EmptyStackException if stack is empty 
	 * 
	 */
	public T peek();
	/**
	 * detects whether stack is empty 
	 * @return true if the stack is empty 
	 * 
	 */
	public boolean isEmpty();
	
	/**
	 * removes all entries from the stack
	 * 
	 */
	public void clear();
	
}//end interface
