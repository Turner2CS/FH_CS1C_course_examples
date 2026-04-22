package week01_part02.solution;

import week01_part02.ParameterizedRoom;
import week01_part02.RegularRoom;

public class TestRooms
{
	public static void main(String [] args)
	{
		RegularRoom crib = new RegularRoom("Will");

		// 	Specifies an Integer type for the parameterized argument in the method
		//  and auto-boxes the value 1234 in an Integer object as the argument.
		//  The instance variable lockCombination of type Object will point
		//  to a subclass type.
		int combo01 = crib.setLock(1234);
		System.out.println(crib);

		// 	Similar to above, specifies an Integer type for parameterized arguments
		// 	in the method and passes the value 9090 as the argument.
		int combo02 = crib.setLock(9090);
		System.out.println(crib);

		// 	Specifies a String type for the parameterized argument in the method
		//  and passes the value "fresh" as the argument.
		//  The instance variable lockCombination of type Object will point
		//  to a subclass type.
		String combo03 = crib.setLock("fresh");	// 	QUESTION: ...and here?
		System.out.println(crib);
		
		System.out.println("");


		// 	Specifies an Integer type for the parameterized argument for the class.
		//  The instance variable lockCombination is of type Integer.
		ParameterizedRoom<Integer> cave = new ParameterizedRoom<Integer>("Ali");

		//  Auto-boxes the value 1234 in an Integer object as the argument.
		//  The instance variable lockCombination of type Integer will point
		//	to an Integer type.
		combo01 = cave.setLock(1234);
		System.out.println(cave);

		// Similar to above.
		combo02 = cave.setLock(9090);
		System.out.println(cave);

		// Tries to pass Integer for the argument setLock.  Fails as the method
		// only accepts arguments of type Integer or a parent subclass of Integer.
		//combo03 = cave.setLock("agimagi");
		//System.out.println(cave);
	}
}
