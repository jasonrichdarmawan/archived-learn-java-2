package learn_java;

public class Main {
	public static void main(String[] args) {
		// Java data types
		// Primitive data types: byte, short, int, long, float, double, boolean, and char
		// Non-primitive data types: string, arrays, classes.

		// Primitive data specifies the size and type of variable values.
		// System.out.println(Integer.BYTES) will output 4 (in bytes). Note, 1 byte = 8 bit.
		// Hence, the total value of integer is 2^32 - 1, Integer.MAX_VALUe is 2^31 - 1, Integer.MIN_VALUE is -2^31

		// byte
		System.out.println("Byte.BYTES: " + Byte.BYTES);
		System.out.println("Byte in bit: " + Byte.SIZE);

		// integer
		int i = 10;
		System.out.println("integer value i: " + i);
		System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
		System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
		System.out.println("Integer.BYTES: " + Integer.BYTES);
		System.out.println("Integer in bit: " + Integer.SIZE);
	}
}