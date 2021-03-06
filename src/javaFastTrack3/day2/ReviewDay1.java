package javaFastTrack3.day2;

public class ReviewDay1 {
	public static void main(String[] args) {
		// String is a special class in Java, it is an object, it is also a char array
		// String is an immutable class
		// Immutable means >> once you created an immutable object, you can not change
		// it.
		int a = 10; // 16bytes
		String str = "hello";

		System.out.println(str.hashCode());

		str = "hola";

		System.out.println(str.hashCode());

		// here is the rule, whenever we create an object, we have to use "new"
		// keyword. But that rule does not apply for string.
		// using the "new" keyword creates a dif object in the memory
		// if we are creating 2 objects with the same value without using "new" keyword
		// it will be stored in the same place in the memory
		String str2 = "world";
		String str3 = "world";

		String str4 = new String("world");

	}
}
