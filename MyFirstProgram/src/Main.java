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
		public String Leader = "Bipin";
		
		public Amway(String name, int age) {
			this.Name = name;
			this.Age = age;
		}
		public abstract void freedomCall();
	}
	
	public static class IBO extends Amway {
		public String Leader = "Ashi";
		public IBO(String name, int age) {
			//NOTE: Here, we are using the Superclass constructor to instatiate an object using the IBO Class that extends from the Amway (Parent) Class --> We MUST use the "super" keyword and use the same parameters
			super(name, age);
		}
		public void freedomCall() {
			System.out.println("My name is " + this.Name + " and I am free");
			System.out.println(Leader);
			//Using the "super" keyword to access immediate parent class instance variable
			System.out.println(super.Leader);
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
		
		
		
	}

}
