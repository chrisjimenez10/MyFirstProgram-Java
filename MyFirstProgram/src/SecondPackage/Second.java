package SecondPackage;

public class Second {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B humanoid = new B("Wendy", 23);
		humanoid.greeting();

	}

}
