/**
 * This interface establishes 
 * numeric priority among a set 
 * of objects.
 * @author chessicanation
 * @version 1.0
 * Project 2
 * Program 2
 * CS131ON
 */
public interface Priority 
{
	public static final int MED_PRIORITY = 5;
	public static final int MIN_PRIORITY = 1;
	public static final int MAX_PRIORITY = 10;
	
	public void setPriority(int priority);
	public int getPriority();
	
}//end interface
