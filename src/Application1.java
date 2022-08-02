/**
 * Driver to test the
 * modification of the
 * RationalNumber class.
 * @author chessicanation
 * @version 1.0
 * Project 2
 * Program 1
 * CS131ON
 */
public class Application1 
{

	/**
	 * This main method tests the 
	 * compareTo method of the
	 * RationalNumber class.
	 * @param args
	 */
	public static void main(String[] args) 
	{

		//testing rn1 greater than rn2
		RationalNumber rn1 = new RationalNumber(1,2);
		RationalNumber rn2 = new RationalNumber(1,3);
		
		System.out.println("First rational number: " + rn1);
        System.out.println("Second rational number: " + rn2);

		if(rn1.compareTo(rn2)==0)
			System.out.println("rn1 and rn2 are equal.");
		else
			if(rn1.compareTo(rn2)==-1)
				System.out.println("rn1 is less than rn2.");
			else
				System.out.println("rn1 is greater than rn2.");
		
		//separator println
		System.out.println();
		
		//testing rn3 less than rn4
		RationalNumber rn3 = new RationalNumber(3,8);
		RationalNumber rn4 = new RationalNumber(2,5);
		
		System.out.println("Third rational number: " + rn3);
        System.out.println("Fourth rational number: " + rn4);

		if(rn3.compareTo(rn4)==0)
			System.out.println("rn3 and rn4 are equal.");
		else
			if(rn3.compareTo(rn4)==-1)
				System.out.println("rn3 is less than rn4.");
			else
				System.out.println("rn3 is greater than rn4.");

		//separator println
		System.out.println();
				
		//testing rn5 equal to rn6
		RationalNumber rn5 = new RationalNumber(400,2399);
		RationalNumber rn6 = new RationalNumber(1,6);
				
		System.out.println("Fifth rational number: " + rn5);
        System.out.println("Sixth rational number: " + rn6);

		if(rn5.compareTo(rn6)==0)
			System.out.println("rn5 and rn6 are equal.");
		else
			if(rn5.compareTo(rn6)==-1)
				System.out.println("rn5 is less than rn6.");
			else
				System.out.println("rn5 is greater than rn6.");

	}//end main

}//end class
