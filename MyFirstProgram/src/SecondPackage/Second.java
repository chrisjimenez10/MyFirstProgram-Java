package SecondPackage;

public class Second {
	
	//This Class is being exported and imported INTO Main.java using the "import" keyword - name of package ("SecondPackage") - dot (.) - Asterisk (*)
	public static class B {
		public String name;
		public int age;
		public B(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public void greeting() {
			System.out.println("Hello, my name is " + this.name + " and I am " + this.age);
		}
	}
	
	public static class C {
		public String name;
		public int age;
		public double intelligence;
		
		public void setC(String name, int age, double intelligence) {
			this.name = name;
			this.age = age;
			this.intelligence = intelligence;
		}
		public void setC(String name) {
			this.setC(name, 0, 0);
		}
		public void setC(int age) {
			this.setC("ROBOT", age, 0);
		}
		public void setC(double intelligence) {
			this.setC("ROBOCOP", 10, intelligence);
		}
		public String getName() {
			return this.name;
		}
		public void announce() {
			System.out.println("Announcement");
		}
	}
	
	public static class C2 extends C{
		public void announce() {
			super.announce();
		}
	}
	
	//Interface: Interfaces are implicitly abstract - Each method is also implicitly abstract (abstract keyword NOT necessary) - Methods in an interface are implicitly public --> ALL methods are abstract and any instance fields MUST have the "static" and "final" keywords --> Interfaces DO NOT have: 1.Constructors, 2.CANNOT instantiate an Interface --> Interfaces are IMPLEMENTED by Classes, NOT EXTENDED - Interfaces can EXTEND multiple interfaces --> This here is a NESTED interface, but we can also have an Interface File like any other Class File
	//Rules: 1.A Class can implement more than one Interface at a time, 2.A Class can EXTEND only ONE Class, but implement MANY Interfaces, 3.An Interface can EXTEND another Interface (just like a Class can extend another Class) --> If a Class implements an Interface, it MUST perform ALL of the behaviors of the Interface (like signing a contract), else it has to be declared as "abstract"
	 public interface Animal {
		 public static final String Job = "Software Developer";
		 public static final String Company = "Google";
		 
		 //Interface methods are implicitly "public", so we don't have to use the keyword --> All Interface methods are abstract and ONLY have bodies in the Class that "implements" them
		 public void eat();
		 void travel();
	 }
	 
	 public static class Mammal implements Animal {
		 public String name;
		 public int age;
		 
		 public Mammal(String name, int age) {
			 this.name = name;
			 this.age = age;
		 }
		 
		 public void eat() {
			 System.out.println("The " + this.name + " eats fruits");
		 }
		 
		 public void travel() {
			 System.out.println("The " + this.name + " is " + this.age + " and it's a " + Job + " at " + Company);
		 }			 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B humanoid = new B("Wendy", 23);
		humanoid.greeting();
		
		Mammal eagle = new Mammal("Eagle", 5);
		eagle.eat();
		eagle.travel();
		
		C testing = new C();
		testing.setC(99.9);
		System.out.println(testing.intelligence);
		System.out.println(testing.getName());
		
		C2 firstC = new C2();
		firstC.announce();
		

	}

}
