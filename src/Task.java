/**
 * This class represents a task, 
 * such as one on a to-do list. 
 * It implements the priority and 
 * comparable interfaces.
 * @author chessicanation
 * @version 1.0
 * Project 2
 * Program 2
 * CS131ON
 */
public class Task implements Priority, Comparable<Task>
{
	public enum Status {NOT_STARTED, IN_PROGRESS, COMPLETE}
	
	private Status status;
	
	private final String name;
	private int priority;
	
	/**
	 * Preferred constructor to put
	 * a task in a consistent state.
	 * @param name
	 */
	public Task(String name) 
	{
		super();
		this.name = name;
		this.priority = 1;
	}//end preferred constructor
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() 
	{
		return name;
	}//end getName
	
	/**
	 * Getter for status
	 * @return
	 */
	public Status getStatus()
	{
		return status;
	}//end getStatus
	
	/**
	 * Setter for status
	 * @param status
	 */
	public void setStatus(Status status)
	{	
		this.status = status;	
	}//end setStatus
	
	/**
	 * Setter for priority
	 * @param priority
	 */
	@Override
	public void setPriority(int priority) 
	{
		if((priority==1) || (priority==5) || (priority==10))
			this.priority = priority;
		else
			System.out.println("Invalid priority. Must enter 1, 5, or 10.");
	}//end setPriority

	/**
	 * Getter for priority
	 * @return
	 */
	@Override
	public int getPriority() 
	{
		return priority;
	}//end getPriority
	
	/**
	 * This method compares
	 * priority levels of 
	 * two task objects.
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Task o) 
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
	 * Returns the task object
	 * as a string.
	 * @return
	 */
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + "]";
	}//end toString

}//end class
