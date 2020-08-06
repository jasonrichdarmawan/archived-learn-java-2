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

		// Java Operators

		System.out.println("");

		int int1 = 5;
		int int2 = 3;

		int result;

		// addition
		result = int1 + int2;
		System.out.println("addition 5 + 3: " + result);
		// addition using printf
		System.out.printf("addition with printf %d + %d = %d \n",int1,int2,result);

		// substraction
		result = int1 - int2;
		System.out.println("substraction 5 - 3: " + result);

		// multiplication
		result = int1 * int2;
		System.out.println("multiplication 5 * 3: " + result);

		// integer division
		result = int1 / int2;
		System.out.println("integer division 5 / 3: " + result);
		// float division
		float float1 = 5;
		float float2 = 3;
		float result2;
		result2 = float1 / float2;
		System.out.println("float division 5 / 3: " + result2);

		// modulo
		result = int1 % int2;
		System.out.println("modulo 5 % 3: " + result);

	}
}