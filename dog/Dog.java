class Dog {
	int size;
	String name;
	String breed;

	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}


class DogTestDrive {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.size = 50;
		d.bark();
	}
}
