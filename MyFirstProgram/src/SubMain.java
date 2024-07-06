
import ThirdPackage.*;

public class SubMain {
	
	public static void notification() {
		System.out.println("Notification!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi, from SubMain");
		
		//Using imported Interface file from ThirdPackage:
		ThirdInterface.Party guest = new ThirdInterface.Party();
		//ALL of the methods that were defined by the Party Class, which implemented the Child Interface (Party Class defined ALL 4 methods, both from Parent and Child Interface)
		guest.celebration();
		guest.amazingCelebration();
		guest.greeting();
		guest.amazingGreeting();

	}

}
