/**
 * This class represents a process 
 * that might run on your computer. 
 * It implements the priority and 
 * comparable interfaces.
 * @author chessicanation
 * @version 1.0
 * Project 2
 * Program 2
 * CS131ON
*/
public class Process implements Priority, Comparable<Process>
{
	private final String processID;
	private int priority;
	
	/**
	 * Preferred constructor to put 
	 * a process in a consistent
	 * state.
	 * @param processID
	 */
	public Process(String processID)
	{
		super();
		this.processID = processID;
		this.priority = 1;
	}//end preferred constructor

	/**
	 * Getter for priority
	 * @return
	 */
	public int getPriority() 
	{
		return priority;
	}//end getPriority

	/**
	 * Setter for priority
	 * @param priority
	 */
	public void setPriority(int priority) 
	{
		if((priority==1) || (priority==5) || (priority==10))
			this.priority = priority;
		else
			System.out.println("Invalid priority. Must enter 1, 5, or 10.");
	}//end priority

	/**
	 * Getter for processID
	 * @return
	 */
	public String getProcessID() 
	{
		return processID;
	}//end getProcessID

	/**
	 * This method compares
	 * priority levels of 
	 * two process objects.
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Process o) 
	{
		if(priority==o.getPriority())
			return 0;
		else
			if(priority<o.getPriority())
				return -1;
			else
				return 1;
	}//end compareTo

	/**
	 * Returns the process object
	 * as a string.
	 * @return
	 */
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString

}//end class
