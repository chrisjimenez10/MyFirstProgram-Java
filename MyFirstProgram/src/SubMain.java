
import ThirdPackage.*;

public class SubMain {
	
	
	public static void notification() {
		System.out.println("Notification!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi, from SubMain");
		
		//Using imported Interface file from ThirdPackage:
		ThirdInterface.ChildInterface guest = new ThirdInterface.Party();
		//ALL of the methods that were defined by the Party Class, which implemented the Child Interface (Party Class defined ALL 4 methods, both from Parent and Child Interface)
		guest.celebration();
		guest.amazingCelebration();
		guest.greeting();
		guest.amazingGreeting();
		
		ThirdInterface.CousinClass cousinGuest = new ThirdInterface.CousinClass();
		cousinGuest.cousinMethod();
		cousinGuest.amazingCelebration();
		cousinGuest.amazingGreeting();
		cousinGuest.listMethod("Chris Jimenez ---");
		
		//Exceptions: Exceptions are objects that wrap an error event when it occurs within a method and contains - 1.Information about the error, including its type, 2.The state of the program when the error occurred, 3.Optionally, other custom information --> Categories of Exceptions: 1.Checked, 2.Unchecked, 3.Errors 
		//Checked Exceptions: Compiler enforces us to handle these exceptions explicitly - Methods that generate Checked Exceptions MUST declare that they "throw" them
		//Unchecked Exceptions: Compiler DOES NOT enforce us to handle them explicitly - Methods DO NOT have to declare that they "throw" them --> It is assumed that the application cannot do anything to recover from these exceptions (at runtime) --> Errors and RuntimeExceptions are Unchecked
		//Error: These are NOT Exceptions at all and they are problems that arise beyond the control of the user of programmer
		//Exception Hierarchy: Errors and Exceptions are Subclasses of the Throwable Class (Exception Class has Runtime Exceptions and Other Exceptions)
		
		//Catching Exceptions: Methods can use the try/catch block to catch an exception --> The code that might generate an exception inside of a method is wrapped with the try/catch block and it is referred to as "protected code"
		try {
			int [] array = {1,2,3,4};
			System.out.println(array[4]);
		}catch(Exception e) {
			System.out.println("Exception thrown: " + e);
		}
		
		//Throws/Throw Keywords: If a method does not handle a checked exception, it MUST declare it using the "throws" keyword (It appears at the end of a method's signature) --> We can throw an exception (either a newly instantiated one or an exception that we just caught by using the "throw" keyword --> NOTE: "throws" keyword is used to postpone the handling of a checked exception - "throw" keyword is used to INVOKE an exception explicitly

		//Finally Block: The finally block follows a try block or a catch block - A finally block of code ALWAYS executes, regardless of an occurrence of an Exception (In other words, it will always execute its code block) --> Using a finally block allows us to run any cleanup-type statements that we want to execute no matter what hapens in the protected code --> A finally block appears at the END of the catch blocks
		try {
			int [] array2 = {2,4,6,8};
			System.out.println(array2[4]);
		}catch(Exception e) {
			System.out.println("Exception thrown: " + e);
		}finally {
			
			System.out.println("Finally code block executed no matter what");
		}
		
		int a[] = new int[3];
		try {
			System.out.println(a[3]);
		}catch(Exception e) {
			System.out.println("Exception thrown: " + e);
		}finally {
			a[0] = 8;
			System.out.println("First element vale: " + a[0]);
		}
		
		//Creating Arrays
			//Declaration and Instantiation of an Array: When we instantiate an array, we assign the number of elements it will have (Arrays have a limit amount of elements, but we can use the collection framework to allow the array to grow its size at runtime
		int instantiatedArray[] = new int[3]; //Declaration + Instantiation
		instantiatedArray[0] = 2; //Initialization (Here, we are giving value to the element stored an index position 0
		instantiatedArray[1] = 4;
		instantiatedArray[2] = 6;
		//Looping through the array
		for(int i = 0; i < instantiatedArray.length; i++) {
			System.out.println(instantiatedArray[i]);
		}
		
		
	

	}

}
