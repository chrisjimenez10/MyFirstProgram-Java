package ThirdPackage;

public interface ThirdInterface {
	void greeting();
	void celebration();
	
	//Extending Interfaces: We use the EXTENDS keyword to extend an Interface (Similarly like when we extend a Class from another Class - Creating an IS-A(Inheritance) relationship) --> NOTE: The class that uses an extended Interface, MUST account for all data members and DEFINE ALL methods in the inheritance tree (In other words, if the Parent Interface has 2 methods and the EXTENDED Interface has another 2, it has a total of 4 methods (2 from itself and 2 that it inherits from the Parent), therefore the Class that uses the Child Interface MUST account and define ALL 4 methods
	public interface ChildInterface extends ThirdInterface {
		void amazingGreeting();
		void amazingCelebration();
	}
	
	public static class Party implements ChildInterface {
		public void greeting() {
			System.out.println("Hello");
		}
		public void celebration() {
			System.out.println("Celebration");
		}
		
		public void amazingGreeting() {
			System.out.println("Hello!!!!");
		}
		public void amazingCelebration() {
			System.out.println("Celebration!!!");
		}
	}
	
}
