/**
 * Driver to exercise the use of 
 * multiple Task and Process objects.
 * @author chessicanation
 * @version 1.0
 * Project 2
 * Program 2
 * CS131ON
 */
public class Application2 
{
	/**
	 * This main method tests all of
	 * the methods from the Task and
	 * Process classes, Priority
	 * interface, and Status
	 * enumerated type.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/* *****************************************************************
		 * =================================================================
		 *                             TESTING TASK
		 * =================================================================
		 * *****************************************************************
		 */ 
		
		/* ------------------------------------
		 * SETTING UP FIRST TASK (LOW PRIORITY)
		 * ------------------------------------
		 */
		//testing constructor
		Task timesheet = new Task("Timesheet");
		
		//testing toString
		System.out.println(timesheet.toString());
		
		//testing getName
		System.out.println("Name: " + timesheet.getName());
		
		//testing setStatus and getStatus 
		timesheet.setStatus(Task.Status.NOT_STARTED);
		System.out.println("Status: " + timesheet.getStatus());
		
		//testing setPriority (validation check) and getPriority
		timesheet.setPriority(3);
		if(timesheet.getPriority()==1)
			System.out.println("Low Priority");
		else
			if(timesheet.getPriority()==5)
				System.out.println("Medium Priority");
			else
				System.out.println("High Priority");
		
		//separator println
		System.out.println();
		
		/* ----------------------------------------
		 * SETTING UP SECOND TASK (MEDIUM PRIORITY)
		 * ----------------------------------------
		 */
		//testing constructor
		Task email = new Task("Email");
		
		//testing toString
		System.out.println(email.toString());
		
		//testing getName
		System.out.println("Name: " + email.getName());
		
		//testing setStatus and getStatus
		email.setStatus(Task.Status.IN_PROGRESS);
		System.out.println("Status: " + email.getStatus());
		
		//testing setPriority and getPriority
		email.setPriority(5);
		if(email.getPriority()==1)
			System.out.println("Low Priority");
		else
			if(email.getPriority()==5)
				System.out.println("Medium Priority");
			else
				System.out.println("High Priority");
		
		//separator println
		System.out.println();
				
		//testing compareTo (lower)
		if(timesheet.compareTo(email)==0)
			System.out.println("Task 1 (Timesheet) and Task 2 (Email) are equal priority.");
		else
			if(timesheet.compareTo(email)==-1)
				System.out.println("Task 1 (Timesheet) is lower priority than Task 2 (Email).");
			else
				System.out.println("Task 1 (Timesheet) is higher priority than Task 2 (Email).");
		
		//separator println
		System.out.println();
			
		/* -------------------------------------
		 * SETTING UP THIRD TASK (HIGH PRIORITY)
		 * -------------------------------------
		 */
		//testing constructor
		Task print = new Task("Print");
		
		//testing toString
		System.out.println(print.toString());
		
		//testing getName
		System.out.println("Name: " + print.getName());
		
		//testing setStatus and getStatus
		print.setStatus(Task.Status.COMPLETE);
		System.out.println("Status: " + print.getStatus());
		
		//testing setPriority and getPriority
		print.setPriority(10);
		if(print.getPriority()==1)
			System.out.println("Low Priority");
		else
			if(print.getPriority()==5)
				System.out.println("Medium Priority");
			else
				System.out.println("High Priority");
		
		//separator println
		System.out.println();
		
		/* ----------------------------------------
		 * SETTING UP FOURTH TASK (MEDIUM PRIORITY)
		 * ----------------------------------------
		 */
		//testing constructor
		Task read = new Task("Read");
		
		//testing toString
		System.out.println(read.toString());
		
		//testing getName
		System.out.println("Name: " + read.getName());
		
		//testing setStatus and getStatus 
		read.setStatus(Task.Status.NOT_STARTED);
		System.out.println("Status: " + read.getStatus());
		
		//testing setPriority and getPriority
		read.setPriority(5);
		if(read.getPriority()==1)
			System.out.println("Low Priority");
		else
			if(read.getPriority()==5)
				System.out.println("Medium Priority");
			else
				System.out.println("High Priority");
		
		//separator println
		System.out.println();
				
		//testing compareTo (higher)
		if(print.compareTo(read)==0)
			System.out.println("Task 3 (Print) and Task 4 (Read) are equal priority.");
		else
			if(print.compareTo(read)==-1)
				System.out.println("Task 3 (Print) is lower priority than Task 4 (Read).");
			else
				System.out.println("Task 3 (Print) is higher priority than Task 4 (Read).");
		
		//separator println
		System.out.println();
		
		//testing compareTo (equal)
		if(email.compareTo(read)==0)
			System.out.println("Task 2 (Email) and Task 4 (Read) are equal priority.");
		else
			if(email.compareTo(read)==-1)
				System.out.println("Task 2 (Email) is lower priority than Task 4 (Read).");
			else
				System.out.println("Task 2 (Email) is higher priority than Task 4 (Read).");
		
		//separator println
		System.out.println();
				
		/* *****************************************************************
		 * =================================================================
		 *                         TESTING PROCESS
		 * =================================================================
		 * *****************************************************************
		 */ 
		
		/* ---------------------------------------
		 * SETTING UP FIRST PROCESS (LOW PRIORITY)
		 * ---------------------------------------
		 */
		//testing constructor
		Process word = new Process("Word");
		
		//testing toString
		System.out.println(word.toString());
		
		//testing getProcessID
		System.out.println("Process ID: " + word.getProcessID());
		
		//testing setPriority (validation check) and getPriority
		word.setPriority(8);
		if(word.getPriority()==1)
			System.out.println("Low Priority");
		else
			if(word.getPriority()==5)
				System.out.println("Medium Priority");
			else
				System.out.println("High Priority");
		
		//separator println
		System.out.println();
		
		/* -------------------------------------------
		 * SETTING UP SECOND PROCESS (MEDIUM PRIORITY)
		 * -------------------------------------------
		 */
		//testing constructor
		Process excel = new Process("Excel");
		
		//testing toString
		System.out.println(excel.toString());
				
		//testing getProcessID
		System.out.println("Process ID: " + excel.getProcessID());
				
		//testing setPriority and getPriority
		excel.setPriority(5);
		if(excel.getPriority()==1)
			System.out.println("Low Priority");
		else
			if(excel.getPriority()==5)
				System.out.println("Medium Priority");
			else
				System.out.println("High Priority");
		
		//separator println
		System.out.println();
		
		//testing compareTo (lower)
		if(word.compareTo(excel)==0)
			System.out.println("Process 1 (Word) and Process 2 (Excel) are equal priority.");
		else
			if(word.compareTo(excel)==-1)
				System.out.println("Process 1 (Word) is lower priority than Process 2 (Excel).");
			else
				System.out.println("Process 1 (Word) is higher priority than Process 2 (Excel).");
	
		//separator println
		System.out.println();
		
		/* ----------------------------------------
		 * SETTING UP THIRD PROCESS (HIGH PRIORITY)
		 * ----------------------------------------
		 */
		//testing constructor
		Process outlook = new Process("Outlook");
		
		//testing toString
		System.out.println(outlook.toString());
		
		//testing getProcessID
		System.out.println("Process ID: " + outlook.getProcessID());
		
		//testing setPriority and getPriority
		outlook.setPriority(10);
		if(outlook.getPriority()==1)
			System.out.println("Low Priority");
		else
			if(outlook.getPriority()==5)
				System.out.println("Medium Priority");
			else
				System.out.println("High Priority");
		
		//separator println
		System.out.println();
		
		/* -------------------------------------------
		 * SETTING UP FOURTH PROCESS (MEDIUM PRIORITY)
		 * -------------------------------------------
		 */
		//testing constructor
		Process chrome = new Process("Chrome");
		
		//testing toString
		System.out.println(chrome.toString());
				
		//testing getProcessID
		System.out.println("Process ID: " + chrome.getProcessID());
				
		//testing setPriority and getPriority
		chrome.setPriority(5);
		if(chrome.getPriority()==1)
			System.out.println("Low Priority");
		else
			if(chrome.getPriority()==5)
				System.out.println("Medium Priority");
			else
				System.out.println("High Priority");
		
		//separator println
		System.out.println();
		
		//testing compareTo (higher)
		if(outlook.compareTo(chrome)==0)
			System.out.println("Process 3 (Outlook) and Process 4 (Chrome) are equal priority.");
		else
			if(outlook.compareTo(chrome)==-1)
				System.out.println("Process 3 (Outlook) is lower priority than Process 4 (Chrome).");
			else
				System.out.println("Process 3 (Outlook) is higher priority than Process 4 (Chrome).");
	
		//separator println
		System.out.println();

		//testing compareTo (equal)
		if(excel.compareTo(chrome)==0)
			System.out.println("Process 2 (Excel) and Process 4 (Chrome) are equal priority.");
		else
			if(excel.compareTo(chrome)==-1)
				System.out.println("Process 2 (Excel) is lower priority than Process 4 (Chrome).");
			else
				System.out.println("Process 2 (Excel) is higher priority than Process 4 (Chrome).");

	}//end main

}//end class
