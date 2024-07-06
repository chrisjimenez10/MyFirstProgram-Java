//Importing packages: We can use the "import" keyword followed by the package name, then dot "." and then asterisk to indicate that we are IMPORTING EVERYTHING from the package (Except subpackages) --> NOTE: We can then simply use any Class or Interface from the exporting package
import SecondPackage.*;
import SecondPackage.Second.B;
//IMPORTANT: The syntax format for declaring a Class, Method, or Field with multiple modifiers follows the following order: 1.Access Modifiers (private, default, protected, public), 2.Non-access modifiers (abstract, static, final, synchronized, native, volatile, transient), 3.Return Type (for Methods) - Type (for Fields)
public class Main {
	//When we are creating our own Classes within the Main Class, we need to assign the static keyword so we can use the Pet Class without having to instantiate the Main Class
	public static class Pet{
		public String Name;
		public int Age;
		public String Breed;
		public String Owner;
		
		//Constructor with Parameters that will initialize an object and provide values at the time of object creation
		public Pet(String name, int age, String breed){
			//Important: We use the "this" keyword to refer to the property field of the class and the value is referring to the argument that is passed at time of object creation using this constructor
			this.Name = name;
			this.Age = age;
			this.Breed = breed;
		}
		//Parameterless constructor that gets invoked when we instantiate an object without passing any values as arguments
		public Pet() {			
		}
		
		//Constructor Overloading: We can have multiple constructors, but they have to differ in number of parameters/arguments and/or data type of parameters
		public Pet(String name, int age, String owner, String breed) {
			this.Name = name;
			this.Age = age;
			this.Owner = owner;
			this.Breed = breed;
		}
	}
	
	public static class Dog extends Pet{
		public String Address;
		public Dog(String name, int age, String breed, String owner, String address) {
			//Here, we are using the "super" keyword to invoke parent class constructor --> NOTE: We MUST put the parent class constructor in the first line of the subclass constructor, THEN we can add any additional fields we want for the subclass constructor
			super(name, age, breed, owner);
				this.Address = address;
		}
	}
	
	public static class Human{
		public String Name;
		
		public static void greeting() {
			System.out.println("Hello");
		}
	}
	
	//Defining an Abstract Class: Abstract classes CANNOT be instatiated and can have either abstract or non-abstract methods --> We MUST create a child/subclass that extends from the Abstract Parent Class to be able to use the abstract method 
	public static abstract class Alien{
		//An abstract method DOES NOT have a body --> The body is created in the child class that uses it
		public abstract void greeting();
	}
	//Here, we are extending the Alien Class so we can use the abstract method -->NOTE: the abstract method here MUST have a body and can actually return something
	public static class BabyAlien extends Alien{
		public void greeting() {
			System.out.println("This is the abstract method from the abstract Parent Class!");
		}
		//Method Overloading: Here, we are using the same method name, but assigning different number of arguments --> Depending on the inputs when accessing this method, it will use whichever method is applicable
		public static int Add(int x, int y) {
			return x + y;
		}
		public static int Add(int x, int y, int z) {
			return x + y + z;
		}
	}
	
	//Sample Exercise
	public static class Bank {
		public static int getRateOfInterest(int x) {
			return x;
		}
	}
	
	public static class SBI extends Bank {
		private static int y = 10;
		public static int getRateOfInterest(int x) {
			return x * y;
		}
	}
	
	public static class ICICI extends Bank {
		private static int y = 20;
		public static int getRateOfInterest(int x) {
			return x * y;
		}
	}
	
	public static class Student {
		int studentId;
		String studentName;
		String collegeName;
		String address;
		
		public void setName(String name) {
			this.studentName = name;
		}
		public String getName() {
			return studentName;
		}
	}
	
	//Abstract Class with a constructor
	static abstract class Amway {
		String Name;
		int Age;
		public String Leader = "King";
		
		public Amway(String name, int age) {
			this.Name = name;
			this.Age = age;
		}
		public abstract void freedomCall();
		
		public void singleMethod() {
			System.out.println("Parent method used with super keyword");
		}
	}
	
	public static class IBO extends Amway {
		public String Leader = "Queen";
		public IBO(String name, int age) {
			//NOTE: Here, we are using the Superclass constructor to instatiate an object using the IBO Class that extends from the Amway (Parent) Class --> We MUST use the "super" keyword and use the same parameters
			super(name, age);
		}
		public void freedomCall() {
			System.out.println("My name is " + this.Name + " and I am free");
			System.out.println(Leader);
			//Using the "super" keyword to access immediate parent class instance variable
			System.out.println(super.Leader);
			//Using the "super" keyword to access immediate parent class method
			super.singleMethod();
		}
	}
	

	//main method of the Main Class that gets compiled when we run our program --> Anything inside this method gets compiled and becomes output to the Console
	public static void main(String[] args) {

		Pet firstPet = new Pet("Mimi", 4, "Poodle");
		System.out.println(firstPet.Name);
		
		Pet secondPet = new Pet();
		secondPet.Name = "Lady";
		System.out.println(secondPet.Name);
		
		Human.greeting();
		
		Alien firstBabyAlien = new BabyAlien();
		firstBabyAlien.greeting();
		
		//Method Overloading: Multiple methods with SAME name, but different parameters (1.Number of arguments, 2.Data type of arguments) --> Increases readability of program
		System.out.println(BabyAlien.Add(1, 2));
		System.out.println(BabyAlien.Add(1, 2, 3));
		
		System.out.println(SBI.getRateOfInterest(10));
		System.out.println(ICICI.getRateOfInterest(10));
		
		Student firstStudent = new Student();
		firstStudent.setName("Wendy Barajas Avilez");
		System.out.println(firstStudent.getName());
		
		Amway firstDownline = new IBO("Chris", 29);
		firstDownline.freedomCall();
		
		int u = 6;
		if(u < 10) {
			if(u == 5) {
				System.out.println("U is equal to 5");
			}else if(u == 6) {
				System.out.println("U is equal to 6");
			}else {
				System.out.println("U is less than 10, but not equal to 5 or 6");
			}
			
		}
		
		//Switch Statement: Allows a variable to be tested for equality against a list of values --> Each value is called a "case" and the variable being switched on is checked for each case
		switch(u) {
			case 5:
				System.out.println("U is equal to 5");
				break;
			case 6:
				System.out.println("U is equal to 6");
				break;
			default:
				System.out.println("U is not equal to 5 or 6");
		}
		
		//The for...loop: Allows us to execute a statement or group of statements multiple times --> It uses 3 parts: 1.Initialization, 2.Expression to be checked, 3.Update Action (for loop useful when we know how many times a task is to be repeated)
		for(int h = 10; h < 20; h++) {
			System.out.println("h is: " + h);
		}
		
		//While loop
		int p = 0;
		while(p <= 10) {
			System.out.println("p is: " + p);
			p++;
		}
		
		//The do...while loop
		int z = 0;
		do {
			System.out.println("z is: " + z);
			z++;
		}while(z <= 5);
		
		//The Enhanced for...loop: It is mainly used to traverse collections of elements including arrays --> The first part is the "Declaration" and it's the same type as the elements of the array we are accessing (It is accessible from inside the code block and the second part is the "Expression" which is the array we want to loop through (It can be an array variable or a method call that returns an array)
		int [] array = {1,2,3,4};
		int sum = 0;
		for(int x : array) {
			sum += x;
		}
		System.out.println(sum);
		
		Dog awesomeDog = new Dog("name", 10, "breed", "owner", "address");
		System.out.println(awesomeDog.Address);
		
		//The "final" keyword: 1.Stops value change, 2.Stops method overriding, 3.Stops inheritance
		final String lastname = "Jimenez";
		System.out.println(lastname);
		//lastname = "Quiroz";
		//System.out.println(lastname);
		
		//Creating a String object using the String Class by using a constructor that takes an array of character literals (individual characters --> NOTE: For character literals we use single quotes)
		char [] helloArray = {'h', 'e', 'l', 'l', 'o'};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		helloString = "hi";
		System.out.println(helloString);
		
		//Accessor Methods: Methods used to obtain information about an object --> To obtain the length of a String object is the length() method --> Spaces are also included in the length count because they occupy space
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println("String length is: " + len);
		
		//String Concatenation: The String Class includes a method for concatenating two strings - concat() --> We can also use the concat() method with string literals --> Most COMMON way is to use the "+" operator
		String stringOne = "hello";
		String stringTwo = "Hello";
		System.out.println(stringOne.concat(" " + stringTwo));
		System.out.println("What's up ".concat("Person"));
		
		//The charAt() method: Returns character at specified index
		System.out.println(stringOne.charAt(1));
		//The compareTo() method: Returns integer after compares if one object is less than, equal, or greater than the other --> Negative = less than, Zero = equal, Positive = greater than
		System.out.println(stringOne.compareTo(stringTwo));
		//The equals() method: Returns boolean comparing equality of String objects
		System.out.println(stringOne.equals(stringTwo));
		//The equalsIgnoreCase() method: Compares string objects ignoring case sensitivity and returns boolean
		System.out.println(stringOne.equalsIgnoreCase(stringTwo));
		
		//Here, we are using the B Class, which is being imported from the "SecondPackage" package --> import statement at the top of file
		B humanoid = new B("Wendy", 23);
		humanoid.greeting();
		
		//We can also use the FULLY QUALIFIED NAME: With this convention, we don't need the import keyword, but we NEED to use this fully qualified name every time we try to access a Class from another package --> NOTE: Use dot notation to access nested Classes and their static methods
		ThirdPackage.Third.fullyQualifiedName();
		
		//Using another Class file from the SAME package --> NOTE: We don't need an import statement and simply use it like if it were declared INSIDE this Class file
		SubMain.notification();
				
	}

}
